## 2025-05-14 - Refactoring Navigation Menu Items
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern as it triggers the soft keyboard unnecessarily and lacks the correct semantic meaning for screen readers. Replacing them with `TextView` provides a better experience.
**Action:** Always verify if a clickable item that looks like a menu or list item is intended for data entry; if not, use `TextView` and ensure `clickable="true"`, `focusable="true"`, and `?attr/selectableItemBackground` are set for proper interaction feedback.
