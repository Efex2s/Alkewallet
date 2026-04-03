## 2025-05-15 - Splash Screen and Asset Optimization
**Learning:** Hardcoded splash screen delays (e.g., 3000ms) significantly degrade perceived startup performance. Additionally, unused large assets and 'MissingClass' lint errors (due to manifest entries for non-existent classes) are common performance and maintenance bottlenecks in this codebase.
**Action:** Always check for arbitrary 'postDelayed' timers in Splash activities and audit the 'res/drawable' directory for large, unreferenced files. Run './gradlew lintDebug' early to identify build-blocking configuration bloat.
