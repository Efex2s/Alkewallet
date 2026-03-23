## 2025-01-24 - Profile Menu Refactor
**Learning:** Using `EditText` components for static navigation menu items is a UX anti-pattern as it erroneously triggers the soft keyboard and suggests editable content where none exists. This creates friction and accessibility confusion.
**Action:** Always use `TextView` or `Button` for navigation items, ensuring they have interactive feedback (ripple) and clear `contentDescription` for screen readers.
