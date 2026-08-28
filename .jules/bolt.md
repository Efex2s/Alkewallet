# Bolt Performance Journal

## 2025-05-18 - Splash Delay Reduction and Main Thread Handler Memory Leak Prevention
**Learning:** Hardcoded 3000ms delay in splash screen blocks Time to Interactive (TTI) without necessity. Using parameterless `new Handler()` is deprecated and can leak activity context if `postDelayed` callbacks remain queued when `Splash_Screen` activity is destroyed.
**Action:** Use `new Handler(Looper.getMainLooper())`, reduce delay to 1000ms for faster startup, and clear callbacks in `onDestroy()`.
