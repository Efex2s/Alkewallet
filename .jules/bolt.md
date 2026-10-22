# Bolt Performance Journal

## 2025-02-18 - Startup TTI Optimization & Handler Leak Prevention in Splash_Screen
**Learning:** Hardcoded `Handler.postDelayed()` timers on Splash screens add direct startup latency that inflates Time to Interactive (TTI). Using the parameterless `new Handler()` constructor can lead to unexpected behaviors across threads or deprecation issues, while failing to clear delayed `Runnable` callbacks in `onDestroy()` leaks the `Activity` context if closed prematurely.
**Action:** Always reduce artificial splash delays to the minimal required transition time (e.g., 1000ms), construct `Handler` with `Looper.getMainLooper()`, and hold a reference to `Runnable` to call `handler.removeCallbacks(...)` inside `onDestroy()`.
