# Bolt Performance Journal

This journal tracks critical performance-related learnings for the AlkeWallet Android application.

## 2024-05-23 - [Optimization of Startup Delay]
**Learning:** Hardcoded delays in Splash screens (like 3000ms) significantly degrade the perceived performance and Time to Interactive (TTI). Reducing these to the minimum necessary (e.g., 1000ms) and using modern thread management (Looper.getMainLooper()) provides a measurable win in responsiveness.
**Action:** Always audit for hardcoded 'postDelayed' values in entry point activities.
