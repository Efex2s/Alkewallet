# Bolt Performance Journal

## 2024-07-03 - Optimizing App Startup Time
**Learning:** Hardcoded delays in the Splash Screen (e.g., 3000ms) significantly impact perceived performance and Time to Interactive (TTI). Modern Android best practices suggest minimizing these delays or using the Splash Screen API. Additionally, using `new Handler()` without a `Looper` is deprecated and can lead to bugs in multi-threaded environments.
**Action:** Always check `Splash_Screen.java` for hardcoded delays and ensure `Handler` instances are bound to the main looper using `new Handler(Looper.getMainLooper())`.
