## 2025-05-18 - Splash Delay Optimization & Handler Lifecycle Memory Leak Prevention

**Learning:** Hardcoded splash screen delays significantly degrade Time to Interactive (TTI) without user benefit. Using `new Handler()` without `Looper.getMainLooper()` is deprecated and unsafe. Uncleared delayed Handler runnables retain Activity instances after destruction, causing context memory leaks.

**Action:** Minimize splash delays to 1000ms max, instantiate `Handler` explicitly with `Looper.getMainLooper()`, and always invoke `handler.removeCallbacks(...)` in `onDestroy()`.
