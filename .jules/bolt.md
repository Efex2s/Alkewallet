## 2025-02-24 - Reduce Splash Screen Delay & Lifecycle Handler Cleanup
**Learning:** Hardcoded splash delays artificially degrade Time to Interactive (TTI) metrics. Using `Handler` without an explicit `Looper` binding can target deprecated constructors or wrong threads, and unmanaged delayed runnables can trigger memory leaks or invalid activity transitions post-destruction.
**Action:** Always instantiate `Handler(Looper.getMainLooper())`, keep splash delay to the minimum functional necessity (e.g. 1000ms), and remove pending callbacks in `onDestroy()`.
