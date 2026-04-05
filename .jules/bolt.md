## 2025-05-15 - Android Resource Hygiene as Performance
**Learning:** In legacy or poorly maintained Android projects, "MissingClass" lint errors often indicate dead code (Activities and Layouts) that still contribute to APK size and build times. Deleting these is a safe, high-impact "Bolt" task when verified against the source tree.
**Action:** Always run `lintDebug` early to find "MissingClass" errors as they are prime candidates for cleanup and optimization.
