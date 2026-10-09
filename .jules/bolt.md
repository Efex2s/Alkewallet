# Bolt's Performance Journal

## 2025-05-10 - Splash Screen Startup Delay and Handler Safety
**Learning:** Hardcoded long delays (like 3000ms) in splash screens directly degrade app launch Time to Interactive (TTI). Furthermore, instantiating `Handler` without an explicit `Looper.getMainLooper()` is deprecated in modern Android and can lead to memory leaks if callbacks are not cleared in `onDestroy()`.
**Action:** Always reduce artificial splash delays to the minimum required (e.g., 1000ms), pass explicit `Looper.getMainLooper()` to `Handler`, and clean up posted runnables in `onDestroy()`.
