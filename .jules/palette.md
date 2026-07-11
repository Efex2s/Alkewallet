# Palette UX Journal

## 2025-05-14 - EditText as Navigation Item Anti-pattern
**Learning:** Using `EditText` for non-editable navigation menu items is a poor UX pattern. It triggers the soft keyboard when tapped and misleads screen readers.
**Action:** Always use `TextView` or `Button` with `android:focusable="true"` and `android:clickable="true"` for navigation items, even if the design system previously used `EditText`.
