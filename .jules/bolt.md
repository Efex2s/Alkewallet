## 2025-05-15 - Splash Screen Delay and Asset Cleanup
**Learning:** Reducing Splash Screen delay (3000ms -> 1000ms) significantly improves perceived performance. Removing large (824KB) unused assets like `circular.png` and resolving build-blocking lint errors (MissingClass) are essential for app efficiency and maintenance.
**Action:** Always check for long hardcoded delays and use `lintDebug` to find unused/missing references. Run `find` and `grep` to verify assets are truly unused before deletion.
