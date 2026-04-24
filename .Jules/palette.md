## 2024-04-24 - [TextView as Menu Items]
**Learning:** Using `EditText` for non-editable navigation menu items is a poor UX pattern as it triggers the soft keyboard and misleads users. `TextView` with `selectableItemBackground` provides a much cleaner, more intuitive experience.
**Action:** Always use `TextView` or `Button` for navigation elements and ensure proper touch feedback and accessibility labels are present.
