## 2026-03-05 - Android Splash Screen Optimization
**Learning:** Anonymous Runnables in Handlers can cause memory leaks if the Activity is destroyed before the delay ends. Static activities with no view interaction are better off without ViewBinding to reduce overhead.
**Action:** Use member variables for Handlers/Runnables and remove callbacks in onDestroy(). Use direct inflation for simple static activities.
