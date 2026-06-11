## 2026-06-11 - Refactoring Navigation Menus
**Learning:** Using `EditText` for navigation menu items is a poor UX pattern because it triggers the soft keyboard when a user simply wants to navigate. Using semantic `TextViews` with click listeners provides a cleaner interaction.
**Action:** Always use `TextView` or `Button` for non-input navigational elements and ensure they have appropriate interactive feedback (e.g., ripples).
