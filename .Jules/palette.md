# Palette Journal

## 2026-05-14 - Improved Profile Menu UX
**Learning:** Using `EditText` for navigational or static menu items is a poor UX pattern because it unnecessarily triggers the soft keyboard and implies editability where only navigation is intended. Refactoring to `TextView` with `selectableItemBackground` provides clear interactive feedback without the overhead of input focus.
**Action:** Prefer `TextView` for interactive list items and menus. Ensure `clickable="true"` and `focusable="true"` are set for accessibility, and use `selectableItemBackground` for visual feedback.
