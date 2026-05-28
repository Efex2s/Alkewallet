## 2024-05-23 - Avoid EditText for Navigation Menus
**Learning:** Using `EditText` components for navigation menu items triggers the soft keyboard upon selection, which is disruptive and non-standard. It also lacks the correct semantic role for accessibility tools.
**Action:** Use `TextView` or `Button` with `android:background="?android:attr/selectableItemBackground"` for navigation items to ensure a smooth transition and proper accessibility feedback.
