## 2024-06-08 - Optimized Splash Screen Delay and Handler

**Learning:** Hardcoded 3000ms delays in Splash Screens are a significant bottleneck for perceived performance and TTI (Time-to-Interactive). Additionally, using `new Handler()` without an explicit Looper is a deprecated anti-pattern in modern Android development that can lead to thread-safety issues.

**Action:** Always prefer `new Handler(Looper.getMainLooper())` for UI-related tasks and keep splash screen durations minimal (e.g., 1000ms or less) unless background initialization strictly requires more time.
