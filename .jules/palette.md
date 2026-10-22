# Palette UX Journal

## 2024-05-18 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` for non-editable navigation menu items is an anti-pattern in Android. It confuses screen readers into announcing input fields and triggers the soft keyboard unexpectedly when tapped.
**Action:** Always use `TextView` or `Button` with `android:clickable="true"`, `android:focusable="true"`, and `android:background="?attr/selectableItemBackground"` for interactive navigation items.
