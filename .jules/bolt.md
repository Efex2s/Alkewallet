# Bolt Journal

## 2025-02-16 - Optimize Splash Screen Delay and Eliminate Context Leaks
**Learning:** Hardcoded 3000ms splash delays significantly hurt TTI (Time to Interactive) without functional benefit. Furthermore, instantiating `Handler()` without an explicit `Looper` can execute on arbitrary background threads and causes deprecation warnings. Uncleared handler callbacks on Activity destruction can leak Activity contexts.
**Action:** Always reduce artificial splash delays to 1000ms or lower, instantiate handlers explicitly with `Looper.getMainLooper()`, and clean up callbacks via `handler.removeCallbacks(...)` in `onDestroy()`.
