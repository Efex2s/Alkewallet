# Bolt Performance Journal

## 2026-10-05 - Splash Delay Reduction and Handler Lifecycle Management
**Learning:** Artificial delays in splash screens directly degrade app startup Time to Interactive (TTI). Using parameterless `new Handler()` is deprecated and unsafe as it implicitly uses the thread's looper, which can lead to bugs or leaks. Anonymous runables in delayed handlers hold an implicit strong reference to the Activity instance, causing memory leaks if the Activity is destroyed or recreated (e.g. orientation change) before the delay elapses.
**Action:** Always reduce hardcoded startup delays to the bare minimum (or remove completely), instantiate `Handler(Looper.getMainLooper())` explicitly, and remove callbacks using `handler.removeCallbacks(runnable)` in `onDestroy()`.
