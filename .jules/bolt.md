# Bolt Performance Journal

## 2025-05-18 - Splash Screen Delay Optimization and Handler Lifecycle Safety
**Learning:** Hardcoded delay intervals in startup Splash screens directly inflate Time to Interactive (TTI) metrics. Constructing `Handler` without `Looper.getMainLooper()` creates thread-safety hazards and deprecation warnings in Android. Failing to unregister delayed `Runnable` callbacks in `onDestroy()` leaks the `Activity` context when the activity is destroyed before the timer completes.
**Action:** Always reduce artificial startup delays to the minimum required duration (1000ms), pass explicit `Looper.getMainLooper()` to `Handler` instances, and cancel pending handlers in `onDestroy()`.
