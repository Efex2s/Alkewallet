## 2025-01-24 - Splash Screen & Perceived Performance
**Learning:** Hardcoded delays in Splash Screens (e.g., 3000ms) are a common bottleneck for perceived app startup performance. Additionally, using `new Handler()` without a specified Looper is a deprecated pattern that can lead to subtle bugs; `new Handler(Looper.getMainLooper())` is the modern standard for UI-related tasks.
**Action:** Always check for hardcoded delays in Splash activities and prefer `Looper.getMainLooper()` when posting tasks to the UI thread to ensure reliability and performance.
