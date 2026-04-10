## 2025-05-15 - [Cleanup and Build Optimization]
**Learning:** Removing unused assets and resolving `MissingClass` lint errors (caused by orphaned manifest entries and layouts) significantly improves project health and reduces APK size. Enabling R8 minification is a low-effort, high-impact performance win for release builds.
**Action:** Always check `lintDebug` for `MissingClass` or `UnusedResources` errors and ensure `isMinifyEnabled` is active in `build.gradle.kts` for production-ready code.
