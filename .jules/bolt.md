## 2024-05-21 - Artificial Splash Screen Delay
**Learning:** Identified an artificial splash screen delay of 3000ms in `Splash_Screen.java`, which negatively impacts perceived performance by making the user wait unnecessarily. Also found usage of deprecated `new Handler()` constructor.
**Action:** Reduced the delay to 1000ms for a better balance between branding and speed. Updated the implementation to use `new Handler(Looper.getMainLooper())` to follow modern Android best practices and ensure main-thread execution.
