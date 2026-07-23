## 2026-02-01 - Splash Handler & TTI Optimization
**Learning:** Hardcoded startup delays (like a 3000ms Splash delay) directly degrade Time to Interactive (TTI). Additionally, instantiating `Handler` without a `Looper` defaults to the current thread's Looper, which causes deprecation warnings and potential thread safety bugs.
**Action:** Always reduce splash screen delay to the minimum acceptable duration (e.g., 1000ms) and explicitly instantiate `Handler` with `Looper.getMainLooper()` to guarantee UI updates run on the main thread safely.
