## 2026-01-31 - Splash Delay and Main Thread Looper Optimization
**Learning:** Hardcoded startup delays (e.g., 3000ms delay on Splash_Screen.java) degrade Time to Interactive (TTI) and user retention. Instantiating a Handler without an explicit Looper is deprecated and prone to context memory leaks if the Activity finishes early.
**Action:** Always optimize startup delays down to 1000ms, use Looper.getMainLooper() for Handler instantiation, and cancel pending postDelayed callbacks in onDestroy() to prevent leakages.
