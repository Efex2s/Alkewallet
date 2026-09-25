## 2025-05-20 - Splash Screen Handler Memory Leaks & TTI Optimization
**Learning:** Hardcoded splash delays artificially degrade Time To Interactive (TTI). Using unmanaged Handler instances can lead to memory leaks if the Activity finishes before the delay expires.
**Action:** Always specify `Looper.getMainLooper()` for main-thread Handlers, keep a reference to posted Runnables, and clear callbacks in `onDestroy()`.
