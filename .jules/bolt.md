# Bolt Journal - Performance Optimizations

## Mission
Identify and implement performance improvements to make the application faster and more efficient.

## 2024-04-22 - Optimized Splash and Asset Cleanup
**Learning:** Artificial delays (e.g., 3000ms in `Splash_Screen.java`) negatively impact perceived performance and user retention. Large unreferenced assets like `circular.png` (824KB) bloat the APK size without providing value.
**Action:** Always audit splash screen durations and periodically run lint/grep to identify and remove unreferenced large assets. Also, ensure the manifest is clean of missing classes to maintain build health.
