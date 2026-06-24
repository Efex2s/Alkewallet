## 2024-05-23 - Avoid EditText for Navigation
**Learning:** Using `EditText` for non-editable navigation menu items is a poor UX pattern as it triggers the soft keyboard and misleads users. Refactoring them to `TextView` with `selectableItemBackground` provides a much cleaner navigation experience.
**Action:** Always use `TextView` or `Button` for navigation items, and ensure `clickable` and `focusable` are set for accessibility.
