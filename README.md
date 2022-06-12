# LFRWH

An Xposed module to use LineageOS FMRadio without Headphones.

---

Based on the following sources:

- https://github.com/LineageOS/android_packages_apps_FMRadio/blob/lineage-18.1/src/com/android/fmradio/FmService.java#L365
- https://github.com/sonyxperiadev/vendor-qcom-opensource-fm

# What's new:

* Addressed compatibility with LineageOS 19.1,

* Added support for LSPosed,

* Fixed compilation,

* Upgraded dependencies,

# Hardware peripheral:

The usage of microphone antenna is suggested:

![image](https://user-images.githubusercontent.com/7214961/173235387-505979da-d92d-4356-b090-e37e265ffba3.png)

# Issues:

* Currently spam LSPosed Manager with logs need to be addressed,

* MinSDK need to be upgraded to the LineageOS version that started used CAF radio, currently is on 23.
