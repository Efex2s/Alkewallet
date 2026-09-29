# Bolt Performance Journal

## 2025-09-29 - Splash Screen TTI Optimization & Memory Leak Prevention
**Learning:** Hardcoded 3000ms delay in splash screens negatively impacts Time To Interactive (TTI) and user perception of performance. Instantiating `Handler()` without explicit `Looper.getMainLooper()` is deprecated and prone to background execution bugs. Failing to remove callbacks in `onDestroy()` causes Activity context leaks if the user exits before the delay expires.
**Action:** Reduce delay to 1000ms, use `new Handler(Looper.getMainLooper())`, and remove callbacks on `onDestroy()`.
