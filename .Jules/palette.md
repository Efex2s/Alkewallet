## 2025-05-14 - Using TextView for Navigation Menus
**Learning:** Using `EditText` for navigation menu items is a poor UX and accessibility pattern as it triggers the soft keyboard and misleads screen readers. Converting them to `TextView` with `clickable="true"`, `focusable="true"`, and `selectableItemBackground` provides a much better experience.
**Action:** Always use `TextView` or `Button` for clickable menu items that don't require text input.

## 2025-05-14 - ViewBinding Type Safety
**Learning:** Changing a View's type in XML (e.g., `EditText` to `TextView`) is automatically reflected in the generated ViewBinding class. This maintains type safety and prevents `ClassCastException` as long as the Java/Kotlin code uses the binding objects and doesn't perform manual casts.
**Action:** When refactoring view types, verify that the Activity/Fragment code doesn't have manual casts or type-specific method calls that would break after the change.
