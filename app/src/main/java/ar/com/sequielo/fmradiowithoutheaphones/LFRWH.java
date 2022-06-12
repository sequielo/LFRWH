package ar.com.sequielo.fmradiowithoutheaphones;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

public class LFRWH implements IXposedHookLoadPackage {
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (!lpparam.packageName.equals("com.caf.fmradio"))
            return;

        // XposedBridge.log("[LFRWH] started");

        // https://github.com/LineageOS/android_vendor_qcom_opensource_fm-commonsys/blob/lineage-19.1/fmapp2/src/com/caf/fmradio/FMRadioService.java#L2219
        // https://github.com/LineageOS/android_vendor_qcom_opensource_fm-commonsys
       findAndHookMethod("com.caf.fmradio.FMRadioService", lpparam.classLoader, "isAntennaAvailable", new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                // XposedBridge.log("[LFRWH] hooked FMRadioService.isAntennaAvailable");
                return true;
            }
        });
        findAndHookMethod("com.caf.fmradio.FMRadio", lpparam.classLoader, "isAntennaAvailable", new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                // XposedBridge.log("[LFRWH] hooked FMRadio.isAntennaAvailable");
                return true;
            }
        });
    }
}
