## 2025-05-14 - Refactor Profile Menu items to TextViews
**Learning:** Using `EditText` for navigational menu items causes unnecessary soft keyboard activation, degrading the UX. Switching to `TextView` with `clickable="true"` and `selectableItemBackground` provides a cleaner, more intuitive interaction.
**Action:** Always use semantic components like `Button` or `TextView` for interactive elements that do not require text input.
