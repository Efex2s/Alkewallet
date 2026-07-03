# Palette's Journal

## 2026-07-03 - [Anti-pattern: EditText for Navigation]
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern that triggers the soft keyboard unintentionally and lacks interaction feedback.
**Action:** Always use `TextView` (or `Button`) with `selectableItemBackground`, `clickable="true"`, and `focusable="true"` for navigation items to ensure a smooth, keyboard-friendly experience.
