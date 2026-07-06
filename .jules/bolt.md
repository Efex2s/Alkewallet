## 2025-05-15 - Hardcoded Splash Screen Delay
**Learning:** Hardcoded UI delays in Splash activities (e.g., 3000ms) are common bottlenecks for Time to Interactive (TTI). Reducing these to the minimum necessary (e.g., 1000ms) significantly improves perceived performance. Also, using the default 'Handler()' constructor is an anti-pattern as it's deprecated and may cause leaks or thread issues; always use 'Handler(Looper.getMainLooper())' in Activities.
**Action:** Always check Splash activities for artificial delays and modernize Handler usage to improve startup performance.
