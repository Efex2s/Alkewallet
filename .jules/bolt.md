## 2025-03-29 - Splash Screen TTI Optimization & Handler Leak Prevention
**Learning:** Hardcoded splash delays directly increase user Time to Interactive (TTI). Un-loopered `Handler()` constructors create deprecation issues and risk executing on the wrong thread, while failing to clear callbacks in `onDestroy()` causes Activity context leaks.
**Action:** Always set splash screen delays to the minimum required duration (<=1000ms), pass `Looper.getMainLooper()` explicitly to Handler instances, and cancel pending callbacks in `onDestroy()`.
