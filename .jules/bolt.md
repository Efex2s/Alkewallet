## 2025-05-10 - Splash Screen TTI & Handler Memory Leak Prevention
**Learning:** Hardcoded splash delays penalize app startup Time to Interactive (TTI). Anonymous Handler instances post-delayed without explicit Looper lead to deprecation warnings and can cause Activity context memory leaks if the user exits/finishes the Activity before completion.
**Action:** Always instantiate Handler with `Looper.getMainLooper()`, hold a reference to the Runnable, and clear callbacks in `onDestroy()`. Keep splash delays minimal (e.g., 1000ms max).
