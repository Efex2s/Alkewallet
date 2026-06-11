## 2024-06-11 - Splash Screen and APK Size Optimization
**Learning:** Reducing hardcoded delays in Splash Screens significantly improves perceived performance. Also, identifying and removing unreferenced large assets like 'circular.png' (824KB) is an easy win for APK size reduction.
**Action:** Always check Splash_Screen.java for high delays and use 'new Handler(Looper.getMainLooper())' for modern thread-safe execution. Scan drawable directories for unreferenced large binary files.
