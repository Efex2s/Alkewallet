## 2025-02-19 - Splash Screen Optimization
**Learning:** Static activities with no programmatic view interaction (like Splash Screens) can avoid ViewBinding to reduce memory allocation and inflation time. Reducing Splash Screen delay directly improves TTI (Time To Interactive).
**Action:** Use `setContentView(R.layout.activity_name)` instead of ViewBinding for static activities. Ensure Handlers are lifecycle-safe by removing callbacks in `onDestroy()`.
