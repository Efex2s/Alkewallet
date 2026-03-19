## 2025-05-15 - [Refactor Navigation from EditText to TextView]
**Learning:** Using `EditText` for navigation menu items is a common anti-pattern that causes the soft keyboard to appear unexpectedly, interrupting the user flow. Switching to `TextView` with `selectableItemBackground` preserves the layout while providing the correct semantic interaction and visual feedback.
**Action:** Always verify that interactive elements that are not intended for text input use `TextView` or `Button` instead of `EditText`.
