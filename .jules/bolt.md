## 2024-05-18 - Splash Screen TTI Optimization & Handler Lifecycle Leak Prevention
**Learning:** Hardcoded 3000ms splash screen delays directly harm Time to Interactive (TTI) without adding value. Unbound `Handler` instantiations default to ambiguous Loopers and leak `Activity` contexts when callbacks are not cleared during `onDestroy()`.
**Action:** Minimize hardcoded splash delays (e.g. to 1000ms), always pass `Looper.getMainLooper()` to `Handler` instances in Android UI components, and explicitly clear callbacks in `onDestroy()`.
