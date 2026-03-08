## 2025-03-08 - Cleanup of non-existent activity references
**Learning:** Referencing a non-existent class in `AndroidManifest.xml` (e.g., `.SignupPage`) causes a build-blocking `MissingClass` lint error, preventing further automated verification.
**Action:** Always verify that Java activity classes exist before referencing them in the manifest or as `tools:context` in layouts.

## 2025-03-08 - APK size optimization via unused asset removal
**Learning:** Unused large assets (e.g., `circular.png` ~824KB) significantly bloat the APK size without providing any value.
**Action:** Identify and remove unused assets to reduce bundle size and improve installation efficiency.
