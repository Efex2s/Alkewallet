## 2026-02-01 - Reduce splash screen delay and clear Handler callbacks

**Learning:** Hardcoded delays on splash screens block app startup and severely degrade Time to Interactive (TTI). Using un-loopered `Handler()` instances without clearing callbacks in `onDestroy()` causes Activity leaks and deprecation warnings.
**Action:** Always bind `Handler` instances to `Looper.getMainLooper()`, minimize splash delays to 1s or less, and explicitly clean up callbacks using `removeCallbacks` in `onDestroy()`.
