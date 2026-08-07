## 2024-08-07 - Optimize Splash Screen Startup and Memory Leak
**Learning:** Hardcoded startup delays (like a 3-second Splash handler) artificially delay Time to Interactive (TTI) for users. Standardizing handlers with `Looper.getMainLooper()` guarantees main thread UI execution, and clearing callbacks in `onDestroy` prevents memory leaks if the Activity is closed before execution.
**Action:** Minimize splash timer to 1000ms, use explicit Looper inside Handler instantiation, and clean up callbacks on destroy.
