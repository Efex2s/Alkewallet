# Bolt Journal

This file contains critical performance learnings and discoveries.

## 2026-03-31 - Unused High-Resolution Drawables Inflate APK Size
**Learning:** High-resolution unreferenced bitmap drawables stored in densityless `res/drawable/` folders (such as `circular.png` at 843KB) are packaged directly into the output APK without compression (`stor` mode in zip), inflating the APK download and install size by over 11% (~843KB) with zero user-facing functionality.
**Action:** Audit resource files for unreferenced large bitmaps using Android Lint's `UnusedResources` detector and inspect APK zipinfo to eliminate dead asset bloat.
