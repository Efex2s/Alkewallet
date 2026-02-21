## 2024-05-15 - Optimizing Static Activities
**Learning:** Using ViewBinding in static activities with no programmatic interaction (like Splash Screens) adds unnecessary overhead in terms of class generation, inflation time, and memory allocation. Removing it in favor of direct inflation reduces startup overhead.
**Action:** Use `setContentView(R.layout.layout_name)` directly for static activities and remove ViewBinding references.

## 2024-05-15 - Handler Lifecycle Safety
**Learning:** `new Handler().postDelayed()` is deprecated and risky for memory leaks.
**Action:** Always use `new Handler(Looper.getMainLooper())` and store the `Runnable` in a member variable to call `removeCallbacks()` in `onDestroy()`.
