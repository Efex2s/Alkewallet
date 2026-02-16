# Bolt's Journal - Performance Learnings

## 2024-05-24 - Splash Screen Memory Leak and Startup Efficiency
**Learning:** Found that Splash_Screen used an anonymous inner class Runnable with a 3-second delay, which leaks the Activity instance if destroyed before the delay finishes. Also, the default Handler constructor is deprecated and less explicit than using Looper.getMainLooper().
**Action:** Always store Runnables in member variables and remove callbacks in onDestroy(). Use Looper.getMainLooper() for UI thread Handlers. Reduced delay to 2000ms to improve perceived startup speed without sacrificing splash visibility.
