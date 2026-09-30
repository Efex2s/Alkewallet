# Bolt's Performance Journal

## 2026-03-30 - Splash Screen Startup Latency & Handler Memory Leak Prevention
**Learning:** Hardcoded splash screen delays (e.g. 3000ms via `Handler.postDelayed`) unnecessarily inflate cold start latency and Time To Interactive (TTI). Furthermore, instantiating `Handler` without `Looper.getMainLooper()` poses thread-safety issues, and failing to unregister callbacks in `onDestroy()` leaks the `Activity` context when the user navigates away before timeout expiration.
**Action:** Always optimize splash delays to the minimal required duration (~1000ms or event-driven dismissal), explicitly pass `Looper.getMainLooper()`, and clean up Handler callbacks in `onDestroy()`.
