## 2026-07-18 - [Optimize Startup Performance and Reduce APK Size]
**Learning:** Hardcoded startup delays block Time to Interactive (TTI). Reducing splash screens to 1000ms significantly improves perceived launch performance while preserving main-thread safety with Looper.getMainLooper(). Also, unreferenced large image assets bloat APK sizes needlessly and should be pruned.
**Action:** Always verify if a handler delay is strictly required or can be safely minimized to optimize TTI, and audit drawables for unused large files.
