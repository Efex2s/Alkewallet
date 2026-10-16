## 2026-01-31 - Startup Delay Optimization & Handler Leak Prevention

**Learning:** Hardcoded splash screen delays (e.g. 3000ms) severely impact Time To Interactive (TTI) and user experience during app startup. Furthermore, instantiating `Handler()` without an explicit `Looper` can target non-main threads or trigger deprecation warnings, while unhandled delayed runnables leak the `Activity` context if destroyed before execution.

**Action:**
1. Minimize splash screen delays to the shortest necessary duration (<= 1000ms).
2. Explicitly bind handlers to `Looper.getMainLooper()` when performing UI operations.
3. Save Runnable references and invoke `handler.removeCallbacks(runnable)` in `onDestroy()` to prevent memory leaks.
