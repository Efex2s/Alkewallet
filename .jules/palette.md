# Palette Journal

## 2024-05-23 - Profile Menu Refactor
**Learning:** Using `EditText` for navigation menu items can cause confusion as it triggers the soft keyboard and implies input capability. `TextView` with `selectableItemBackground` provides a more standard and accessible interaction model for navigation.
**Action:** Always use `TextView` or `Button` with appropriate background for navigation menus, ensuring they have accessibility descriptions and visual click feedback.
