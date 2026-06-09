## 2026-06-09 - [Splash Screen Anti-patterns]
**Learning:** Hardcoded artificial delays (e.g., 3000ms) in Splash Screens degrade perceived performance. Additionally, using `new Handler()` without specifying a Looper is a safety anti-pattern in Android that can lead to crashes if not called from a Looper thread.
**Action:** Always reduce artificial delays to the minimum required for branding (e.g., 1000ms) and explicitly use `Looper.getMainLooper()` when initializing Handlers for UI tasks.
