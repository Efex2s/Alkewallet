## 2024-05-24 - [Static Activity Optimization]
**Learning:** In static activities with no programmatic view interaction (like Splash Screens), using ViewBinding is an unnecessary overhead. Direct inflation via `setContentView(R.layout.activity_name)` reduces object allocation and simplifies the inflation process.
**Action:** Use direct inflation for static/simple activities to save memory and improve startup speed.

## 2024-05-24 - [Lifecycle Safety in Handlers]
**Learning:** Using `new Handler()` without a Looper is deprecated and potentially unsafe. Additionally, delayed tasks in Activities must be cleared in `onDestroy()` to prevent memory leaks if the Activity is destroyed before the task executes.
**Action:** Always use `new Handler(Looper.getMainLooper())` for UI tasks and explicitly remove callbacks in the appropriate lifecycle method.
