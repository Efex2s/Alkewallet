## 2025-08-20 - Splash Screen Startup Delay & Memory Leak Optimization
**Learning:** Hardcoded splash screen delays significantly degrade Time to Interactive (TTI) metrics. Additionally, posting delayed runnables without Looper bindings causes deprecation warnings and risks memory leaks if callbacks are not canceled in `onDestroy()`.
**Action:** Always reduce splash screen transitions to the minimum necessary delay (<= 1000ms), explicitly pass `Looper.getMainLooper()`, and clear delayed handler callbacks in `onDestroy()`.
