# Bolt Journal - Performance & Optimizations

## 2025-05-20 - Splash Screen Latency & Context Leak Optimization
**Learning:** Hardcoded splash screen delays (e.g., 3000ms) unnecessarily degrade app launch Time to Interactive (TTI). Constructing `Handler` without `Looper.getMainLooper()` triggers deprecation warnings and potential thread safety issues, while unhandled delayed runnables leak the Activity context if destroyed early.
**Action:** Always reduce artificial splash delays to a minimal duration (e.g., 1000ms), construct Handlers with explicit `Looper.getMainLooper()`, and clean up delayed callbacks in `onDestroy()`.
