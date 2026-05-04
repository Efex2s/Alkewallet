## 2024-05-04 - Semantic Navigation Items
**Learning:** Using `EditText` for navigational menu items (e.g., "Settings", "Help") is a poor UX pattern because it triggers the soft keyboard, confusing users who expect a navigation action. `TextView` with `clickable="true"` and `focusable="true"` is the correct semantic choice.
**Action:** Always use `TextView` for static or navigational list items and apply `?attr/selectableItemBackground` for visual feedback.
