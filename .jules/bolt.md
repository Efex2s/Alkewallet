## 2025-05-15 - Efficient Cleanup via Lint and Asset Audit
**Learning:** Identifying unreferenced large binary assets and resolving `MissingClass` lint errors are quick, high-impact wins for both APK size and build stability.
**Action:** Always run `./gradlew lintDebug` to find dead code/manifest references and perform a project-wide grep for assets before removal.
