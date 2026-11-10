# Bolt's Performance Journal

## 2026-11-10 - Splash Screen Startup Delay and Context Leaks
**Learning:** Hardcoded delays in splash screen activities (e.g., `Handler.postDelayed` with 3000ms) inflate application startup time and Time to Interactive (TTI) without necessity. Furthermore, instantiating `new Handler()` without explicit Looper and failing to clean up delayed runnables on `onDestroy()` can lead to activity context leaks if the user leaves the screen before the delay elapses.
**Action:** Minimize artificial splash delays to the minimum required for branding or transition (1000ms), pass `Looper.getMainLooper()`, and retain runnable references to cleanly remove callbacks in `onDestroy()`.
