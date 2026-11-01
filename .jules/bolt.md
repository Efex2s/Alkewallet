# Bolt's Performance Journal

## 2026-03-06 - Startup Latency and Activity Lifecycle Leaks in Splash Screen
**Learning:** Hardcoded splash delays artificially stall Time to Interactive (TTI). Furthermore, instantiating an unmanaged `Handler` with an anonymous `Runnable` and without explicit `Looper.getMainLooper()` retains the Activity context if destroyed prior to timer expiration, causing memory leaks and deprecation warnings.
**Action:** Minimize startup delays to <= 1000ms, explicitly pass `Looper.getMainLooper()` to `Handler`, and always clear pending callbacks in `onDestroy()`.
