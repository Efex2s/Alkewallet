## 2026-09-02 - Splash Screen Delay & Handler Lifecycle Leaks
**Learning:** Hardcoded splash delays (e.g. 3000ms) bloat Time To Interactive (TTI) without user benefit. Additionally, using `new Handler()` without explicit `Looper.getMainLooper()` is deprecated and un-cleared delayed runnables leak the `Activity` context when the activity is destroyed before timeout execution.
**Action:** Always optimize splash delays to the minimal required duration (<=1000ms), instantiate `Handler` with `Looper.getMainLooper()`, and remove callbacks in `onDestroy()` to safeguard against memory leaks.
