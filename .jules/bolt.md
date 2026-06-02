## 2025-05-14 - Artificial Splash Delay Reduction
**Learning:** Artificial splash delays (e.g., 3000ms) are a common performance anti-pattern in Android apps that negatively impact perceived startup performance. Additionally, using `new Handler()` without an explicit Looper is deprecated and can lead to issues if called from non-UI threads.
**Action:** Audit and reduce artificial splash delays to 1000ms or less. Always use `new Handler(Looper.getMainLooper())` for UI-related tasks to ensure thread safety and avoid deprecation warnings.
