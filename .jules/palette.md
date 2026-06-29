## 2024-06-29 - Using TextView for Navigation Menu Items
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern as it triggers the soft keyboard and implies editability. Refactoring these to `TextView` with `selectableItemBackground`, `clickable="true"`, and `focusable="true"` provides a much smoother and more accessible navigation experience.
**Action:** Always use `TextView` or specialized menu components for navigation lists. Ensure they have visual feedback on click/focus and are properly labeled for screen readers.
