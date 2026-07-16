## 2026-07-16 - [Optimizing Startup TTI and APK Size]
**Learning:** Hardcoded UI delays (e.g., in Splash Activities) are primary bottlenecks for perceived performance. Additionally, unreferenced assets can significantly bloat the APK size without providing any value.
**Action:** Always audit for artificial delays in startup sequences and use tools to identify/remove unused resources.
