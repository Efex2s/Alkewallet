# Bolt Performance Journal

## 2026-03-30 - Optimize Splash Screen TTI & Prevent Handler Memory Leak
**Learning:** Hardcoded splash screen delays (e.g. 3000ms) introduce unnecessary TTI overhead for users. Using unanchored `new Handler().postDelayed()` creates implicit references to the Activity context, causing memory leaks if destroyed before execution.
**Action:** Always instantiate `Handler(Looper.getMainLooper())`, store its reference, keep delays minimal (1000ms), and clean up callbacks via `removeCallbacksAndMessages(null)` in `onDestroy()`.
