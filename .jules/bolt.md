## 2026-04-14 - Splash Screen and Asset Optimization
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance and removing large unreferenced assets (824KB circular.png) provides risk-free APK size reduction. Unused Activity declarations in Manifest block lint checks.
**Action:** Always check for hardcoded Handler delays in Splash screens and audit the drawable folder for large unreferenced assets using grep. Ensure Manifest is clean to allow lint to pass.
