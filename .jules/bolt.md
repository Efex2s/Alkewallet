## 2025-02-20 - Splash Delay Reduction and Handler Memory Leak Prevention
**Learning:** Hardcoded Handler splash delays directly block Time to Interactive (TTI) on cold starts. Furthermore, instantiating `Handler` without `Looper.getMainLooper()` is deprecated and unanchored handlers holding Runnable references to Activities cause memory leaks on early exit or configuration changes.
**Action:** Always reduce artificial splash delays to the minimum functional duration (1000ms), pass `Looper.getMainLooper()` explicitly to Handler constructors, and clear pending callbacks in `onDestroy()`.
