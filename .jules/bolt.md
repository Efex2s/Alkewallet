## 2026-05-15 - [Reduced Artificial Splash Delay]
**Learning:** Hardcoded splash screen delays (e.g., 3000ms) are common "artificial" bottlenecks that negatively impact perceived performance and time-to-interact.
**Action:** Audit Splash Screen activities for long delays and reduce them to the minimum required for branding/loading (e.g., 1000ms or less), while ensuring thread safety by using `new Handler(Looper.getMainLooper())` instead of the deprecated `new Handler()` constructor.
