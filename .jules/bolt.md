## 2024-05-26 - Optimized Startup and Reduced APK Size

**Learning:** Identified artificial delays in `Splash_Screen.java` and unreferenced large assets in the `res/drawable` directory. Artificial delays (e.g., 3000ms) are a common anti-pattern that degrades perceived performance. Unused assets like `circular.png` (824KB) bloat the APK size without providing value.

**Action:** Reduced splash delay to 1000ms and removed unreferenced assets. Use `grep` to audit resource usage and check splash screen implementations for hardcoded delays.
