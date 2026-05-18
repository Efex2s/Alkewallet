## 2024-05-15 - [Profile Screen Refactor]
**Learning:** Using `EditText` for navigation items causes the soft keyboard to trigger on tap, which is a poor UX pattern for static or navigational menus. Refactoring to `TextView` with `selectableItemBackground` provides the correct semantic behavior and touch feedback.
**Action:** Use `TextView` for menu items and ensure interactive elements have `clickable="true"` and `focusable="true"` for accessibility.
