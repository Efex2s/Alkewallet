## 2025-05-15 - Artificial Splash Delay
**Learning:** Artificial splash screen delays (e.g., 3000ms) are a common performance anti-pattern that negatively impacts perceived startup performance. Reducing these delays to a minimum (or removing them in favor of actual data loading) significantly improves user experience.
**Action:** Audit and reduce hardcoded delays in Splash screens and other transitions. Prefer `new Handler(Looper.getMainLooper())` for main-thread operations in Android.
