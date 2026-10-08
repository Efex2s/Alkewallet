# Bolt Journal - Critical Learnings

## 2025-02-18 - Startup TTI Optimization and Memory Leak Prevention
**Learning:** Hardcoded splash delays in Android startup flows (e.g., `Handler.postDelayed` with 3000ms) severely inflate cold-start Time to Interactive (TTI). Furthermore, instantiating `Handler` without `Looper.getMainLooper()` is deprecated and risks executing on non-UI threads if initialized incorrectly. Without calling `removeCallbacks()` in `onDestroy()`, holding references to the activity context causes memory leaks if the user exits or rotates the screen before navigation finishes.
**Action:** Always audit startup activities to minimize artificial delays to essential durations (e.g., 1000ms), pass `Looper.getMainLooper()` explicitly to Handler constructors, and clear pending callbacks in `onDestroy()`.
