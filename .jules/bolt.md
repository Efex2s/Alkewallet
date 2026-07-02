# Bolt Performance Journal

## 2024-07-02 - Reachability Analysis
**Learning:** Some layouts and activities (like `MainActivity` and `activity_main.xml`) may exist in the codebase but are not declared in `AndroidManifest.xml`, making them unreachable in the production app flow. Optimizing these provides zero runtime benefit.
**Action:** Always verify activity and layout reachability via `AndroidManifest.xml` before selecting an optimization target.
