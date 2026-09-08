## 2026-09-08 - Initialized Bolt Journal
**Learning:** Initialized bolt performance journal for tracking performance learnings in Android app.
**Action:** Use this journal for logging critical performance insights.

## 2026-09-08 - Splash Screen Handler & Latency Optimization
**Learning:** Hardcoded 3000ms splash screen delays unnecessarily inflate app startup latency / Time To Interactive (TTI), while unmanaged Handler runnables cause Activity context leaks if the user leaves before execution.
**Action:** Always use `Looper.getMainLooper()` explicitly when instantiating Handlers in Activities, keep splash delays minimal (<=1000ms), and clean up callbacks in `onDestroy()`.
