# Bolt Performance Journal

## 2025-02-17 - Splash Screen Delay, Looper Binding, and Leak Prevention
**Learning:** Hardcoded 3000ms splash delays severely degrade launch performance and user-perceived Time to Interactive (TTI). Furthermore, using the default `Handler()` constructor is deprecated in modern Android as it relies on implicit Looper threads, and failing to clear pending `Runnable` callbacks in `onDestroy()` causes Activity context leaks.
**Action:** Always reduce artificial delays in launch activities to the minimum necessary duration (1000ms or lower), construct `Handler` explicitly with `Looper.getMainLooper()`, and clean up posted runnables in `onDestroy()` to prevent memory leaks.
