## 2024-06-03 - [Splash Screen Optimization]
**Learning:** Artificial splash screen delays (e.g., 3000ms) negatively impact perceived performance and user retention. Additionally, using 'new Handler()' without an explicit Looper is a legacy anti-pattern that can lead to thread-safety issues and performance bottlenecks in Android.
**Action:** Reduced the artificial delay to 1000ms and refactored the 'Handler' to use 'Looper.getMainLooper()' for improved thread safety and modern SDK compatibility.
