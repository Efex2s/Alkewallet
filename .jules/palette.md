## 2025-05-14 - Refactoring Navigation Menus for Improved UX
**Learning:** Using `EditText` for navigation menu items is a poor UX pattern in Android because it triggers the soft keyboard upon interaction, which is frustrating when the user intends to navigate. `TextView` with `clickable="true"` and visual ripple feedback (`?attr/selectableItemBackground`) provides a much cleaner and more intuitive interaction.
**Action:** Always use `TextView` or `Button` for non-input interactive elements and ensure appropriate accessibility properties like `contentDescription` are provided.
