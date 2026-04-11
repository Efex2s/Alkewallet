## 2024-05-15 - [Safe component refactoring in Android]
**Learning:** Changing component types in XML layouts (e.g., EditText to TextView) will cause a `ClassCastException` at runtime if the ID is referenced and cast to the old type in Java/Kotlin code. Build might pass but app will crash at runtime.
**Action:** Always grep the codebase for the component ID in `app/src/main/java` before changing its type in XML.

## 2024-05-15 - [Implicit manifest dependencies]
**Learning:** Dangling Activity declarations in AndroidManifest.xml for non-existent classes cause `MissingClass` lint errors that can block CI/CD or strictly configured builds.
**Action:** Prune `AndroidManifest.xml` and associated layouts when deleting Activity classes. Run `lintDebug` to verify.
