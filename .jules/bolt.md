## 2025-05-15 - [Splash Screen and APK Size Optimization]
**Learning:** Reducing the artificial Splash Screen delay (3000ms -> 1000ms) significantly improves perceived startup speed. Removing unused large assets (circular.png, 824KB) and redundant code/layouts (SignupPage) reduces APK size and resolves build-blocking 'MissingClass' lint errors.
**Action:** Always check Splash_Screen implementation for hardcoded delays and use 'lintDebug' to identify missing classes and unused resources for quick performance and cleanup wins.
