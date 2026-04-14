## 2026-04-14 - Optimized Startup and APK Size
**Learning:** Artificial delays in splash screens (3000ms) negatively impact perceived performance. Removing unreferenced large assets (824KB `circular.png`) provides an immediate, risk-free reduction in APK size.
**Action:** Always check `Splash_Screen` classes for excessive hardcoded delays and perform project-wide `grep` for assets before deletion to ensure they are truly unused.
