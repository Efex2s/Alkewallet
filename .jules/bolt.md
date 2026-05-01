# Bolt Performance Journal

## 2024-05-01 - Startup and APK Size Optimization
**Learning:** Artificial splash screen delays (3000ms) significantly impact perceived performance. Unreferenced large assets (like `circular.png` at 824KB) contribute to APK bloat without benefit. Lint errors in `AndroidManifest.xml` (MissingClass) can indicate orphaned resources (layouts) that can be safely removed.
**Action:** Always check for `Handler().postDelayed` in Splash screens and audit the drawable folder for large unreferenced assets using `grep`. Resolve `MissingClass` errors by removing both the manifest entry and the associated orphaned layout files.
