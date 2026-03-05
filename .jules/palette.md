## 2024-05-17 - Refactor navigation items from EditText to TextView
**Learning:** Using `EditText` for navigation menu items in Android is a poor UX pattern as it triggers the soft keyboard erroneously. Using `TextView` with `selectableItemBackground` and `contentDescription` provides the correct semantic role, visual feedback, and accessibility.
**Action:** Always use `TextView` or `Button` for navigation links; ensure they have `focusable="true"`, `clickable="true"`, and appropriate `contentDescription`.
