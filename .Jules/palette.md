# Palette's Journal - Critical Learnings Only

## 2025-01-24 - Navigation Menu Component Selection
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability to the user. This creates friction and confusion during navigation.
**Action:** Always use `TextView` or `Button` for static navigation items. Ensure they have visual feedback (ripple effects) and clear `contentDescription` for accessibility.
