# Palette UX Journal

## 2024-05-23 - Anti-pattern: EditText for Navigation
**Learning:** Using `EditText` as a navigation menu item is a UX anti-pattern. It suggests to the user and screen readers that the field is editable, triggering the soft keyboard on tap and providing misleading accessibility roles.
**Action:** Always use `TextView` or `Button` for interactive list items that lead to other screens, ensuring `android:clickable="true"` and `android:focusable="true"` are set for accessibility.
