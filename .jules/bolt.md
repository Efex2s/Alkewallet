# Bolt Performance Journal

## 2026-02-01 - Optimizing Startup Splash Delay and Handler Memory Leaks
**Learning:** Hardcoded `postDelayed` handlers in splash screens directly delay Time to Interactive (TTI) on startup. Unbound `new Handler()` instances can cause thread ambiguity and leak activity context if destroyed prior to completion.
**Action:** Always reduce fixed splash screen delays to minimal durations (e.g. 1000ms), construct handlers explicitly with `Looper.getMainLooper()`, and clear callbacks in `onDestroy()`.
