## 2026-03-30 - Splash Screen Startup Delay and Lifecycle Memory Leaks

**Learning:** Hardcoded 3000ms splash screen delays directly penalize Time to Interactive (TTI) without providing functional value. Additionally, instantiated `Handler`s without `Looper.getMainLooper()` produce deprecation warnings and risk memory leaks or thread mismatch issues if callbacks aren't unregistered in `onDestroy()`.

**Action:** In startup/splash screens, minimize delay times to 1000ms or lower (or bind to initialization tasks), explicitly construct `Handler`s using `Looper.getMainLooper()`, and clean up pending `Runnable` callbacks in `onDestroy()`.
