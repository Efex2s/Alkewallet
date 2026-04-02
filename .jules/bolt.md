## 2025-05-15 - [Unused Assets and Manifest cleanup]
**Learning:** Removing unreferenced large assets (like 'circular.png', 824KB) and resolving build-blocking 'MissingClass' lint errors by cleaning up the AndroidManifest.xml and associated dead layouts are highly effective ways to improve app efficiency and maintainability with minimal risk.
**Action:** Always run `./gradlew lintDebug` to identify unreferenced or missing components early in the development cycle.
