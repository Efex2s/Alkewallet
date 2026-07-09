## 2025-05-14 - Splash Screen and Asset Optimization
**Learning:** Hardcoded UI delays in `Splash_Screen.java` directly impact the Time to Interactive (TTI) and perceived performance. Large unreferenced assets like `circular.png` (824KB) bloat the APK size without providing any value.
**Action:** Always check for excessive startup delays and verify asset usage using `grep` before deployment to maintain a lean and fast application.
