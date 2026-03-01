## 2025-05-14 - Navigation Menu Semantic Correction
**Learning:** Using `EditText` for navigation items is a UX anti-pattern that triggers the soft keyboard unexpectedly. Using `TextView` with `selectableItemBackground` and `clickable="true"` provides a better experience while maintaining the same visual appearance.
**Action:** Always check if an `EditText` is being used for static or navigational content and refactor it to `TextView` to improve accessibility and prevent keyboard interference.

## 2025-05-14 - Manifest Integrity for Build Verification
**Learning:** Pre-existing `MissingClass` errors in `AndroidManifest.xml` can block the entire lint and build verification pipeline.
**Action:** Before performing UX or performance optimizations that require build verification, ensure the manifest is clean and all referenced activities exist.
