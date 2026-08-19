## 2024-08-19 - Avoid Using EditText for Navigation Menu Items

**Learning:** Using `EditText` as interactive list items for screen navigation confuses screen readers (announcing them as editable text boxes) and allows unexpected soft keyboard popups. Replacing them with `TextView` configured with `android:clickable="true"`, `android:focusable="true"`, and `android:background="?android:attr/selectableItemBackground"` maintains proper semantic role, accessible keyboard focus, and native touch feedback.
**Action:** Always use `TextView` or standard clickable components for non-editable navigation items, ensuring touch feedback (`selectableItemBackground`) and proper string resources are used instead of input hints.
