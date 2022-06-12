# LFRWH

An Xposed module to use LineageOS FMRadio without Headphones.

---

Based on the following sources:

- https://github.com/LineageOS/android_vendor_qcom_opensource_fm-commonsys/blob/lineage-19.1/fmapp2/src/com/caf/fmradio/FMRadioService.java#L2219
- https://github.com/LineageOS/android_vendor_qcom_opensource_fm-commonsys
# What's new:

* Addressed compatibility with LineageOS 19.1,

* Added support for LSPosed,

* Fixed compilation,

* Upgraded dependencies,

* Fixed LSPosed Manager log spam.

# Hardware peripheral:

The usage of microphone antenna is suggested:

![image](https://user-images.githubusercontent.com/7214961/173235387-505979da-d92d-4356-b090-e37e265ffba3.png)

# Issues:

* MinSDK need to be upgraded to the LineageOS version that started used CAF radio, currently is on 23.

# Size compiled: 

< 10 KB 
