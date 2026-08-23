## 2026-08-23 - Splash Screen Optimization & Memory Leak Prevention

**Learning:** Hardcoded long delays in splash screens (3000ms+) negatively impact Time to Interactive (TTI). Furthermore, using implicit Handlers without specifying `Looper.getMainLooper()` is deprecated in modern Android SDKs and can leak Activity contexts if pending delayed runnables are not cancelled when the Activity is destroyed.

**Action:** Reduce artificial startup delays to the minimum required duration (e.g. 1000ms), construct `Handler` with `Looper.getMainLooper()`, and retain runnable references to call `handler.removeCallbacks(...)` in `onDestroy()`.
