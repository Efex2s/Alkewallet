# Bolt's Performance Journal

## 2024-11-11 - Eliminate Dead Resource Bloat in APK Bundle
**Learning:** Large unreferenced raster image assets in `res/drawable` (e.g. `circular.png` at 843 KB) are directly packaged into the debug APK, inflating APK size and download bandwidth without Gradle/shrinkResources stripping them unless explicitly enabled in release builds.
**Action:** Audit resource files using zip inspection of the assembled APK and grep across layouts/code to detect and purge unused heavy assets.
