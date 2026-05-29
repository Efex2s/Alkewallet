## 2025-05-29 - Artificial Splash Delay
**Learning:** The application had a hardcoded 3000ms delay in `Splash_Screen.java`, which is a common anti-pattern that unnecessarily degrades perceived performance.
**Action:** Reduced the artificial delay to 1000ms and updated the implementation to use `Looper.getMainLooper()` for modern Android standards. Audit other activities for similar synchronous delays or artificial waits.
