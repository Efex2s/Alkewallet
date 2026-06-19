## 2024-05-30 - Optimize Splash Screen Startup
**Learning:** Using 'new Handler()' without an explicit Looper is a performance and safety anti-pattern in Android. It can lead to memory leaks or execution on unexpected threads. Reducing artificial delays in Splash screens significantly improves perceived performance.
**Action:** Always prefer 'new Handler(Looper.getMainLooper())' for UI tasks and keep splash screen durations to the minimum required for brand presence or initialization.
