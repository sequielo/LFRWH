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

        XposedBridge.log("[LFRWH] started");

        // https://github.com/LineageOS/android_packages_apps_FMRadio/blob/lineage-18.1/src/com/android/fmradio/FmService.java#L365
        // https://github.com/LineageOS-eXtended/android_packages_apps_FMRadio/commit/f55656492904e35d7678f7d61881190579a547f8
       findAndHookMethod("com.caf.fmradio.FmService", lpparam.classLoader, "isAntennaAvailable", new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                XposedBridge.log("[LFRWH] hooked FmService.isAntennaAvailable");
                return true;
            }
        });
        findAndHookMethod("com.android.fmradio.FmMainActivity", lpparam.classLoader, "isAntennaAvailable", new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                XposedBridge.log("[LFRWH] hooked FmMainActivity.isAntennaAvailable");
                return true;
            }
        });
    }
}
