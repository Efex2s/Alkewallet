# Bolt Performance Journal

## 2024-05-24 - Artificial Splash Delay
**Learning:** Found a hardcoded 3000ms delay in `Splash_Screen.java`. Artificial delays in splash screens are a common performance anti-pattern that hurts perceived startup speed. Users prefer to reach the functional part of the app as quickly as possible.
**Action:** Audit splash screens for hardcoded delays and reduce them to the minimum necessary for branding/initialization (or remove entirely if possible). Also, prefer `new Handler(Looper.getMainLooper())` over the deprecated `new Handler()` for main thread operations.
