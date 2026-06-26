## 2025-05-14 - Splash Screen Delay and Handler Anti-pattern
**Learning:** Found a hardcoded 3-second splash screen delay which negatively impacts perceived startup performance. Additionally, the use of `new Handler()` without an explicit Looper is a safety anti-pattern in Android that can lead to crashes or leaks.
**Action:** Always reduce splash screen delays to the minimum necessary for branding/init (e.g., 1s) and use `new Handler(Looper.getMainLooper())` to ensure execution on the main thread and follow modern SDK best practices.
