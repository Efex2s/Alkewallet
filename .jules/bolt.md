# Bolt Performance Journal

## 2026-03-31 - Splash Delay & Handler Memory Leak Optimization
**Learning:** Hardcoded splash delays severely degrade app TTI (Time to Interactive). Unbounded `Handler` execution with default constructors can leak `Activity` contexts when destroyed before delay completion and can cause runtime deprecation issues across Android SDK versions.
**Action:** Minimize hardcoded launcher delays to 1000ms max, instantiate `Handler` with `Looper.getMainLooper()`, and systematically clean up callbacks in `onDestroy()`.
