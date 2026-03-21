## 2024-05-24 - [Unused Assets and R8 Optimization]
**Learning:** The project contained a large (824KB) unused drawable 'circular.png' and had minification disabled, leading to a larger than necessary APK. Additionally, dead references to non-existent activities (SignupPage) in the manifest blocked the build.
**Action:** Always perform a project-wide search for asset references before deletion and ensure the manifest only contains existing activities. Enable `isMinifyEnabled` for release builds to trigger R8 optimization.
