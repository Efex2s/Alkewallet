## 2024-05-22 - Artificial Splash Delay
**Learning:** Artificial delays in splash screens (e.g., 3000ms) are a common performance anti-pattern that negatively impacts perceived startup time. While often used for branding, they should be minimized to the absolute necessary (or replaced with proper state-based transitions).
**Action:** Audit splash screens for hardcoded delays and reduce them to improve perceived performance. Ensure main-thread operations use `Looper.getMainLooper()` for safety.
