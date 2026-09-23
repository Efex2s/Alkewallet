## 2026-09-23 - Splash Screen Handler Optimization
**Learning:** Hardcoded 3000ms Handler delays in Splash screen activities cause severe TTI (Time To Interactive) penalties, and parameterless `new Handler()` constructors leak Activity contexts if destroyed before execution while also triggering Android API 30+ deprecation warnings.
**Action:** Always reduce splash delays to the minimum necessary duration (<= 1000ms), pass explicit `Looper.getMainLooper()`, and clean up callbacks via `handler.removeCallbacks(...)` in `onDestroy()`.
