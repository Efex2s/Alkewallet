## 2024-05-11 - Semantic navigation items in Android
**Learning:** Using `EditText` for static navigation menu items is a UX anti-pattern as it triggers the soft keyboard and displays a cursor, which confuses users.
**Action:** Use `TextView` for navigation or static menu items. Ensure they have `?attr/selectableItemBackground` for touch feedback and appropriate accessibility properties like `clickable="true"` and `focusable="true"`.
