## 2025-05-15 - Improving Profile Menu Semantics and Accessibility
**Learning:** Using `EditText` for non-editable navigation menu items is a UX anti-pattern. It incorrectly suggests to the user and screen readers that the field is editable, and it can trigger the soft keyboard unnecessarily.
**Action:** Always use `TextView` or `Button` for navigation items. Ensure interactive elements provide visual feedback (ripple effect) and clear `contentDescription` for accessibility. Use `app:drawableStartCompat` and `app:drawableEndCompat` for better compatibility with older Android versions.
