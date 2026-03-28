# Bolt Performance Journal

## 2026-03-28 - Optimization of startup speed and APK size
**Learning:** Removing unreferenced resources in Android (like unused drawables) must be meticulously checked against build-blocking manifest and layout references. Even if a file seems unused, its declaration in the manifest or layout tools:context can cause build failures if deleted. Reducing splash screen postDelayed() is an effective way to improve perceived performance.
**Action:** Always run a full Gradle build (assemble and lint) after removing any code or assets to catch missing class/resource errors.
