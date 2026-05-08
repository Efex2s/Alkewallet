## 2026-05-08 - Artificial Splash Screen Delay
**Learning:** The application had an artificial 3000ms delay in the Splash Screen, which negatively impacts the perceived performance and user experience by blocking access to the app's main functionality. Additionally, using the default `Handler()` constructor is deprecated and can lead to issues if not called on a thread with a Looper.
**Action:** Reduced the splash screen delay to 1000ms and updated the implementation to use `new Handler(Looper.getMainLooper())` to ensure it runs on the main thread and follows modern Android best practices.
