# Bolt Performance Journal

## 2026-03-31 - Splash Delay, Main Looper Binding, and Context Leak Prevention
**Learning:** Hardcoded 3000ms splash delays severely degrade startup responsiveness and Time-to-Interactive (TTI). Furthermore, instantiating `Handler()` without an explicit `Looper.getMainLooper()` is deprecated and can cause thread execution issues. Leaving posted runnables active when an activity destroys causes context memory leaks.
**Action:** Always reduce splash screen delay to minimal essential duration (1000ms), construct `Handler` using `Looper.getMainLooper()`, and clean up callbacks with `handler.removeCallbacks(...)` in `onDestroy()`.
