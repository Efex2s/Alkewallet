## 2026-06-21 - Splash Screen Optimization
**Learning:** Reducing the Splash Screen delay significantly improves perceived performance and app responsiveness upon startup. Additionally, using `new Handler(Looper.getMainLooper())` instead of the deprecated `new Handler()` constructor ensures the task is correctly posted to the main UI thread, preventing potential runtime issues and following modern Android development standards.
**Action:** Always prefer `Handler(Looper.getMainLooper())` for UI tasks and maintain minimal splash screen durations to enhance UX.
