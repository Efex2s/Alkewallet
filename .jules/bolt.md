## 2025-03-09 - Startup Latency and Handler Memory Leaks in Splash Screen

**Learning:** Hardcoded 3000ms splash screen delays create unnecessary TTI (Time to Interactive) latency for users upon application launch. Additionally, instantiating `Handler` without an explicit `Looper.getMainLooper()` is deprecated and risky across thread contexts, and failing to clear postDelayed callbacks on `onDestroy()` can leak the Activity context if the user exits before the delay finishes.

**Action:** Always minimize artificial launch delays to 1000ms or less, construct `Handler` with `Looper.getMainLooper()`, and clean up delayed callbacks with `handler.removeCallbacks(...)` inside `onDestroy()`.
