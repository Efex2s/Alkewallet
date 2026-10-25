# Bolt Performance Journal - Critical Learnings

## 2025-10-25 - Splash Screen Delay, Handler Thread Safety & Context Leaks
**Learning:** Hardcoded 3000ms delay in `Splash_Screen` severely degraded app Time to Interactive (TTI). Constructing `Handler()` without explicit Looper creates potential thread context issues/deprecation, and unhandled delayed callbacks lead to Activity memory leaks if the user exits/rotates before execution.
**Action:** Always minimize artificial splash delays (e.g., reduce to 1000ms or rely on system splash screen), bind `Handler` explicitly to `Looper.getMainLooper()`, and ensure `handler.removeCallbacks(...)` is executed in `onDestroy()`.
