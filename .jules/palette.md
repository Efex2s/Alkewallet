## 2024-05-24 - Navigation Menu Pattern
**Learning:** Using `EditText` for static navigation menu items is a major UX anti-pattern as it triggers the soft keyboard and lacks appropriate interactive feedback. Replacing them with `TextView` plus `selectableItemBackground` provides the correct affordance and behavior.
**Action:** Always use `TextView` or `Button` with appropriate backgrounds for navigation items; ensure `clickable="true"` and `focusable="true"` are set for accessibility.
