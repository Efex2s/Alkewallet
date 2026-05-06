## 2024-05-14 - Artificial Splash Delay & Deprecated Handler

**Learning:** Artificial delays in splash screens (e.g., 3000ms) negatively impact perceived startup performance. Additionally, using `new Handler()` without a `Looper` is deprecated and can lead to threading issues in Android.

**Action:** Always audit for hardcoded delays in `Splash_Screen` or initialization logic. Use `new Handler(Looper.getMainLooper())` for UI thread operations to ensure thread safety and compatibility.
