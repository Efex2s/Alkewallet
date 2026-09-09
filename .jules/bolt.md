## 2025-05-18 - Audit Unused Large Assets
**Learning:** Large unreferenced image assets (e.g. `circular.png` at ~824KB compressed / ~843KB inside APK) severely bloat APK size and download footprint without providing any functional value.
**Action:** Audit drawable directories for unreferenced high-resolution images or obsolete assets using `grep -rn` before building production binaries to keep APK size lean.
