## 2026-01-31 - Minimize hardcoded splash delay and clean up Handler callbacks
**Learning:** Hardcoded 3000ms splash screen delays significantly hurt Time To Interactive (TTI). Creating unbound Handlers without `Looper.getMainLooper()` leads to deprecation warnings and thread safety risks, while uncancelled delayed Runnables cause memory leaks when activities are destroyed before firing.
**Action:** Always set splash delays to minimal duration (e.g., 1000ms), pass `Looper.getMainLooper()`, and clear callbacks in `onDestroy()` using `removeCallbacksAndMessages(null)`.
