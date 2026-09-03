# Bolt's Performance Journal

## 2025-05-18 - Minimize Artificial Splash Delays and Prevent Handler Memory Leaks
**Learning:** Hardcoded splash delays in Android startup flows delay Time To Interactive (TTI) and degrade user perception of app responsiveness. Additionally, un-cancelled Handler runnables retain references to the Activity context if user navigates away before delay completion, causing memory leaks.
**Action:** Minimize splash delay to the minimum required (e.g. 1000ms), instantiate Handlers with explicit `Looper.getMainLooper()`, and always cancel callbacks in `onDestroy()`.
