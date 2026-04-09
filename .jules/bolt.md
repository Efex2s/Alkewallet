## 2025-05-15 - Initial Performance Optimization
**Learning:** Reducing splash screen delays and removing large unreferenced assets are quick wins for perceived performance and APK efficiency in legacy Android projects. Identifying build-blocking lint errors like MissingClass is crucial for maintaining a healthy CI/CD pipeline.
**Action:** Always check for unreferenced drawables and verify the manifest against the actual source set to ensure build integrity and lean resource management.
