## 2026-08-31 - Splash Screen Delay & Handler Lifecycle Optimization
**Learning:** Hardcoded 3000ms delay in splash screen degraded startup Time to Interactive (TTI), and an unmanaged `Handler` posted delayed runnables without clearing callbacks on `onDestroy()`, causing memory leaks of the `Activity` context.
**Action:** Always reduce fixed splash delays to the minimum functional duration (~1000ms), instantiate `Handler` explicitly with `Looper.getMainLooper()`, and remove callbacks in `onDestroy()` to prevent context leaks.
