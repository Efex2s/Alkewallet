## 2026-06-05 - Reduced Splash Screen delay for faster startup
**Learning:** Artificial delays in splash screens are a common UX bottleneck. Additionally, using `new Handler()` without a Looper is deprecated and potentially unsafe for UI-bound tasks.
**Action:** Always prefer `new Handler(Looper.getMainLooper())` for UI thread operations and minimize artificial delays to the minimum necessary for branding or initialization.
