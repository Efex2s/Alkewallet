## 2025-05-18 - Optimize Splash Screen Delay and Handler Callbacks
**Learning:** Hardcoded 3000ms splash screen delays unnecessarily inflate Time to Interactive (TTI) for users on launch. Using unanchored Handler initializations (`new Handler()`) deprecates in modern API levels and leaves unhandled runnables in the queue, leaking Activity context references on premature finish/destroy.
**Action:** Always instantiate Handlers explicitly with `Looper.getMainLooper()`, set splash delays to the minimum required threshold (e.g. 1000ms), and unregister callbacks in `onDestroy()`.
