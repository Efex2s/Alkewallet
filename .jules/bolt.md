# Bolt Journal

## 2026-05-14 - Optimize splash screen delay
**Learning:** Artificial splash screen delays (e.g., 3000ms) are a common performance anti-pattern that significantly increases perceived startup time. Using the deprecated `new Handler()` constructor can also lead to issues if called from a non-UI thread.
**Action:** Always audit splash screens for hardcoded delays and reduce them to the minimum necessary (or remove entirely if possible). Prefer `new Handler(Looper.getMainLooper())` for main-thread operations in Android.
