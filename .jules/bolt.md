# Bolt Performance Journal

## 2025-02-17 - Splash Screen Latency & Context Leak Prevention
**Learning:** Hardcoded 3000ms delay in `Splash_Screen` artificially degraded startup Time to Interactive (TTI), and an anonymous `Handler().postDelayed()` runnable bound to the Activity instance risked leaking the activity context if destroyed or navigated away from before delay completion. Furthermore, default Handler constructor is deprecated without specifying an explicit `Looper`.
**Action:** Reduced startup splash delay to 1000ms, explicitly bound the Handler to `Looper.getMainLooper()`, and systematically cleared callbacks via `handler.removeCallbacks(navigateRunnable)` in `onDestroy()` to safeguard against lifecycle memory leaks.
