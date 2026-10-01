## 2025-10-01 - Anti-Pattern: EditText as Navigation Menu Items
**Learning:** Using `EditText` for non-editable navigation items in menus causes keyboard popups and confusing screen reader behaviors (announcing editable text field instead of actionable button).
**Action:** Always use `TextView` with `android:clickable="true"`, `android:focusable="true"`, `android:background="?attr/selectableItemBackground"`, and standard `android:text` for navigation options.
