# Palette's UX Journal

## 2025-05-14 - Navigation Item Anti-pattern: EditText for Menu Links
**Learning:** Using `EditText` for navigation menu items is a poor UX pattern in Android as it triggers the software keyboard and displays a cursor. Using `TextView` with `selectableItemBackground` provides the correct interaction model for static navigation.
**Action:** Always prefer `TextView` (or `Button`/`MenuItem`) for navigation links that don't require user input.
