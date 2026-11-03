# Bolt's Performance Journal

## 2025-05-18 - Startup TTI Optimization & Handler Lifecycle Leaks
**Learning:** Hardcoded delay sequences in initial Activities (like splash screens) directly degrade application cold-start Time to Interactive (TTI). Using the default `Handler()` constructor is deprecated in modern Android and risks dispatching on an unexpected looper. Unmanaged Handler callbacks also retain references to the Activity, causing context memory leaks if the user leaves or destroys the Activity before the postDelayed timer expires.
**Action:** Audit startup activities for artificial delays, reduce them to a minimal duration (e.g. 1000ms), explicitly pass `Looper.getMainLooper()`, and cleanly call `handler.removeCallbacks(...)` in `onDestroy()`.
