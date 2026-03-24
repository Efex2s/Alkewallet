# Bolt Journaling Protocol

This file serves as a repository for critical performance insights.

## 2024-05-15 - [Initial performance sprint]
**Learning:** Large unused assets and artificial delays in splash screens are quick wins for performance and user experience. Enabling R8/Minification is crucial for optimized production builds.
**Action:** Always check for unreferenced drawables and review splash screen logic during the profiling phase. Ensure release builds utilize minification.
