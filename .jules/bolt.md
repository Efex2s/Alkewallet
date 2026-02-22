## 2025-02-22 - Splash Screen Lifecycle & Resource Optimization
**Learning:** Static activities with simple timers (like splash screens) are prone to memory leaks if Handlers are not cleaned up in onDestroy, and ViewBinding adds unnecessary overhead for these non-interactive screens.
**Action:** Always use Handler(Looper.getMainLooper()), store Runnables in member variables to remove them in onDestroy, and favor direct setContentView for static splash screens.
