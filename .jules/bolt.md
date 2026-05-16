## 2024-05-16 - Artificial Splash Screen Delay
**Learning:** Artificial splash screen delays (e.g., 3000ms) are a common anti-pattern in this codebase that negatively impacts perceived startup performance. Additionally, using the default `Handler()` constructor is deprecated and less thread-safe than `Handler(Looper.getMainLooper())`.
**Action:** Audit splash screen activities and reduce artificial delays to a minimum (e.g., 1000ms) and ensure modern `Handler` instantiation.
