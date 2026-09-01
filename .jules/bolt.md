# Bolt Performance Journal

## 2026-01-31 - Splash Screen Handler & Delay Optimization
**Learning:** Hardcoded 3000ms splash screen delays significantly hurt Time to Interactive (TTI) and user perception. Using raw `new Handler()` without passing `Looper.getMainLooper()` creates thread safety issues and deprecation warnings in Android, while failing to unbind callbacks causes Activity context memory leaks.
**Action:** Always reduce splash screen delay to minimal necessary (e.g. 1000ms), explicitly pass `Looper.getMainLooper()` to Handler, and retain reference to clear callbacks in `onDestroy()`.
