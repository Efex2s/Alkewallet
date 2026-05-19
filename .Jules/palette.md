## 2024-05-19 - [Profile Screen Refactoring]
**Learning:** Using `EditText` for navigational menu items in Android is a UX anti-pattern as it triggers the soft keyboard and allows users to edit labels.
**Action:** Always use `TextView` for static or navigational list items, and ensure `clickable`, `focusable`, and ripple effects (`selectableItemBackground`) are applied for a native feel and accessibility.
