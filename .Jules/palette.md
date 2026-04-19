# Palette UX Journal

## 2026-04-14 - Using EditText for navigation items
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern as it erroneously triggers the soft keyboard and suggests editability where only navigation is intended. This creates friction and confusion for the user.
**Action:** Always use `TextView` or `Button` for interactive menu items. Ensure they have clear visual feedback (like ripple effects) and proper accessibility attributes (`clickable`, `focusable`, `contentDescription`).
