# Bolt Performance Journal

## 2026-03-28 - Splash Screen Delay & Activity Handler Context Leak
**Learning:** Hardcoded splash screen Handler delays (e.g., 3000ms) delay application interactive readiness (TTI) without functional benefit. Furthermore, delayed `Runnable` instances posted without explicit `Looper.getMainLooper()` trigger deprecation warnings, and failing to unbind callbacks in `onDestroy()` causes Activity Context leaks if destroyed early.
**Action:** Minimize splash screen delays (to <= 1000ms), construct `Handler` with `Looper.getMainLooper()`, and clear callbacks (`removeCallbacks`) in `onDestroy()`.
