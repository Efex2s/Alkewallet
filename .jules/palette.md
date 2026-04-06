
## 2025-05-15 - Profile Menu Refactor
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. Always use `TextView` or `Button` with visual feedback (ripple) and clear `contentDescription`.
**Action:** Before refactoring layout component types, always use `grep` to verify if the IDs are referenced or cast in the Java/Kotlin source code to avoid `ClassCastException` or compilation errors.
