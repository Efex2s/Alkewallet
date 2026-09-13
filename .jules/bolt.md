## 2025-05-18 - Splash Screen Delay Reduction & Handler Memory Leak Fix
**Learning:** Artificial splash screen delays degrade Time To Interactive (TTI). Using parameterless `new Handler()` causes deprecation warnings and thread ambiguity, while unhandled posted Runnables leak Activity contexts when activities are destroyed prior to timer execution.
**Action:** Always instantiate Handlers explicitly with `Looper.getMainLooper()`, minimize splash delays to essential startup durations (e.g. 1000ms or lower), and remove pending callbacks in `onDestroy()`.
