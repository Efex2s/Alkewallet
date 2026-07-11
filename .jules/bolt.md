## 2024-07-11 - Startup Delay Anti-pattern
**Learning:** The application used a hardcoded 3000ms delay in `Splash_Screen.java` using a `Handler` without an explicit `Looper`, which is both a performance bottleneck (TTI) and a potential thread-safety issue.
**Action:** Always audit `Splash_Screen` or entry activities for artificial delays and ensure `Handler` instances use `Looper.getMainLooper()`.
