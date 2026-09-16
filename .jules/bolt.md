## 2025-05-18 - Splash Screen Delay & Handler Memory Leak Prevention
**Learning:** Hardcoded 3000ms splash screen delays unnecessarily degrade app Time to Interactive (TTI). Using parameterless `new Handler()` is deprecated in Android and risks memory leaks if the Activity finishes before the delay elapses without calling `removeCallbacks()`.
**Action:** Always reduce startup splash delays to the minimum required (e.g., 1000ms or lower), explicitly pass `Looper.getMainLooper()` to `Handler` instantiation, and clear callbacks in `onDestroy()`.
