# Palette Journal

## 2025-05-16 - Refactoring Profile Menu Items
**Learning:** Using `EditText` for non-editable navigation menu items is a UX anti-pattern as it triggers the keyboard and misleads the user. `TextView` with ripple feedback is the correct choice.
**Action:** Always use `TextView` or `Button` for navigation items and ensure they have proper accessibility labels.
