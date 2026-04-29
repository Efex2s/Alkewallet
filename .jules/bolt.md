## 2026-04-28 - Optimizing Startup and APK Size
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance, and unreferenced large assets like 'circular.png' (824KB) bloat the APK size without providing value.
**Action:** Always check for artificial delays in Splash/Launch activities and audit the drawable folder for large, unreferenced files during performance reviews.
