# Palette's Journal - Critical Learnings

## 2026-05-20 - Navigational Menu Items Accessibility
**Learning:** Using `EditText` for static or navigational menu items triggers the soft keyboard unnecessarily, creating a disruptive user experience and confusing screen reader users.
**Action:** Use `TextView` with `android:background="?attr/selectableItemBackground"` and `android:focusable="true"` for navigational list items to provide visual feedback without triggering input methods.
