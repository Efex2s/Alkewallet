## 2025-04-25 - [Menu Navigation Accessibility and Feedback]
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern in Android that triggers unnecessary soft keyboards and lacks appropriate click semantics. Converting them to `TextView` with `focusable="true"`, `clickable="true"`, and `selectableItemBackground` provides proper touch feedback and accessibility while preventing keyboard intrusion.
**Action:** Always use `TextView` or `Button` for non-editable interactive list items, and ensure `selectableItemBackground` is applied for visual confirmation of clicks.
