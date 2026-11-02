# Bolt's Performance Journal

## 2026-11-02 - Splash Screen Delay & Handler Context Leak
**Learning:** Hardcoded 3000ms splash screen delays unnecessarily inflate app startup Time to Interactive (TTI), delaying user interaction with the application. Additionally, constructing an anonymous `Handler()` without explicit Looper specification is deprecated and risks context leaks if pending Runnables retain a reference to the destroyed `Activity`.
**Action:** Minimize hardcoded artificial delays to 1000ms for a snappy startup feel, instantiate `Handler` using `Looper.getMainLooper()`, and clean up pending callbacks in `onDestroy()`.
