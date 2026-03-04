## 2025-03-04 - Splash Screen Optimization & Memory Safety
**Learning:** For static entry-point activities (like Splash Screens), using direct layout inflation (`setContentView`) instead of ViewBinding reduces unnecessary object allocation and slightly improves cold start performance. Additionally, using a Handler for delayed navigation without lifecycle cleanup is a common source of memory leaks in Android.
**Action:** Favor direct inflation for simple, static views and always implement `onDestroy` cleanup for Handlers or Runnables.
