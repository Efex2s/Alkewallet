# Bolt's Journal - Critical Performance Learnings

## 2025-05-18 - Splash Screen TTI Optimization & Handler Leak Prevention
**Learning:** Hardcoded splash screen delays unnecessarily inflate Time to Interactive (TTI). Furthermore, using un-referenced `Handler.postDelayed` runnables without explicit Looper bindings and lifecycle cleanup causes activity context memory leaks if the user exits or rotates the screen during startup.
**Action:** Always minimize splash screen delays (<=1000ms), bind `Handler` explicitly to `Looper.getMainLooper()`, and retain runnable references to clean up pending messages in `onDestroy()`.
