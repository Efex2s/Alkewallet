## 2025-10-18 - Startup TTI Optimization & Handler Lifecycle Management

**Learning:** Hardcoded 3000ms splash screen delays inflate Time To Interactive (TTI) and degrade perceived user app startup speed. Constructing `Handler` without `Looper.getMainLooper()` is deprecated in Android and unsafe. Un-cleared `postDelayed` runnables cause Activity context memory leaks if the user leaves the activity before the timer completes.

**Action:** Always reduce splash delays to minimal necessary durations (e.g. 1000ms), construct Handler instances with explicit `Looper.getMainLooper()`, and clean up pending callbacks in `onDestroy()`.
