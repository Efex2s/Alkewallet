## 2025-02-21 - Splash Delay and Handler Memory Leak
**Learning:** Hardcoded splash screen timers significantly inflate Time to Interactive (TTI), and using parameterless Handler constructors creates deprecation warnings as well as potential activity leaks if unmanaged across lifecycles.
**Action:** Minimize hardcoded splash delays (e.g. reduce 3000ms to 1000ms), explicitly instantiate Handlers with `Looper.getMainLooper()`, and clean up pending callbacks in `onDestroy()`.
