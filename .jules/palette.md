## 2025-05-15 - Proper View Selection for Navigation
**Learning:** Using `EditText` for navigation items is a major UX anti-pattern as it triggers the soft keyboard and implies mutability. Switching to `TextView` with `selectableItemBackground`, `clickable`, and `focusable` attributes provides the same visual structure but with correct interactive semantics and accessibility.
**Action:** Always use `TextView` or `Button` for non-editable list items or navigation menus, and ensure they have explicit touch feedback and ARIA-equivalent `contentDescription` or `text`.
