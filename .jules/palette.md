## 2024-05-23 - [Navigation Menu Refactoring]
**Learning:** Using `EditText` for navigation menu items is a major UX anti-pattern as it triggers the soft keyboard when users only intend to navigate. Refactoring these to `TextView` with `selectableItemBackground` provides a much smoother and standard navigation experience.
**Action:** Always use `TextView` or `Button` for non-editable navigation items, ensuring they have proper focus states and accessibility labels.
