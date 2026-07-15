## 2025-05-15 - [Splash Screen Bottleneck]
**Learning:** Hardcoded delays in SplashActivities (e.g., 3000ms) are artificial bottlenecks that negatively impact Time to Interactive (TTI) and user perception of performance.
**Action:** Always audit startup sequences for unnecessary delays and optimize them to the minimum required for brand presence or background initialization.

## 2025-05-15 - [Unused Assets]
**Learning:** The codebase contained a large (~824KB) unreferenced asset `circular.png`, which increases APK size and installation time without providing value.
**Action:** Regularly audit the `res/drawable` directory against layout references to prune dead resources and keep the application lean.
