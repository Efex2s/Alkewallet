## 2024-10-21 - Using EditText for Navigation Items Anti-Pattern
**Learning:** Using `EditText` for non-editable navigation items in menus causes improper accessibility role announcements (screen readers treat them as editable fields) and unexpected keyboard triggers upon interaction.
**Action:** Always use interactive `TextView` elements with explicit `android:clickable="true"`, `android:focusable="true"`, and ripple background (`?attr/selectableItemBackground`) for menu navigation items.
