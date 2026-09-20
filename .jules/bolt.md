# Bolt's Performance Journal

## 2025-05-18 - Splash Screen Delay Optimization & Lifecycle Cleanups
**Learning:** Hardcoded Handler delays in Splash activities directly degrade TTI (Time To Interactive) by blocking user flow for unnecessary durations (e.g. 3000ms). Unbound Handlers without explicit Looper references raise deprecation warnings and risk activity context memory leaks if not cleaned up in `onDestroy()`.
**Action:** Always reduce splash delays to the minimum required for brand display (e.g., <=1000ms), pass `Looper.getMainLooper()` to `Handler` instantiation, and store `Runnable` references to invoke `removeCallbacks()` in `onDestroy()`.
