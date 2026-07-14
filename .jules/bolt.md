## 2024-07-14 - [Splash Screen Optimization]
**Learning:** Hardcoded UI delays (e.g., 3000ms in Splash_Screen.java) are primary bottlenecks for Time to Interactive (TTI) and perceived performance.
**Action:** Always audit for artificial delays in startup sequences and optimize them to the minimum necessary duration (e.g., 1000ms).

## 2024-07-14 - [Resource Hygiene]
**Learning:** Large unreferenced assets (e.g., circular.png @ 824KB) bloat APK size and increase installation time without providing value.
**Action:** Perform regular audits for unused large resources in the `res/` directory.

## 2024-07-14 - [Handler Safety]
**Learning:** Initializing a `Handler` without an explicit `Looper` is deprecated and can lead to bugs if the calling thread isn't the main UI thread.
**Action:** Use `new Handler(Looper.getMainLooper())` for UI operations to ensure thread safety and avoid deprecation warnings.
