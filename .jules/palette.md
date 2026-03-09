## 2024-11-20 - Navigation menus should use TextView, not EditText
**Learning:** Using `EditText` for navigation menu items (even if intended as read-only) is poor UX as it can trigger the soft keyboard on tap and lacks proper semantic meaning for screen readers. `TextView` with `clickable="true"`, `focusable="true"`, and `selectableItemBackground` provides the correct interaction model and accessibility.
**Action:** Always prefer `TextView` for static or navigational list items and ensure they have ripple feedback and appropriate ARIA-equivalent `contentDescription` attributes.
