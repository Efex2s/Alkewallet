## 2026-06-16 - Splash Screen Optimization & Handler Best Practices
**Learning:** High splash screen delays (3s+) negatively impact perceived performance and user retention. Always use `new Handler(Looper.getMainLooper())` for UI tasks to ensure thread safety and avoid potential memory leaks or crashes on newer Android versions.
**Action:** Default to 1000ms or less for splash screens and always specify the Main Looper when instantiating Handlers for UI operations.
