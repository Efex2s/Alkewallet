# Bolt's Journal - Critical Performance Learnings

## 2024-06-12 - Splash Screen Delay Optimization
**Learning:** Hardcoded Splash Screen delays (e.g., 3000ms) negatively impact perceived performance and user retention. Reducing this to a more reasonable value (e.g., 1000ms) significantly improves the app's startup experience.
**Action:** Always prefer shorter splash delays or, better yet, use the Splash Screen API (Android 12+) to handle startup naturally.

## 2024-06-12 - APK Size Optimization via Asset Cleanup
**Learning:** Large, unreferenced assets (like 'circular.png' at 824KB) bloat the APK size unnecessarily, increasing download and installation times.
**Action:** Audit the 'res/drawable' directory for unreferenced assets and remove them during performance passes.
