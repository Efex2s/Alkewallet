# Palette Journal

## 2025-05-14 - Navigation Menu Component Selection
**Learning:** Using `EditText` for navigation menu items is a significant UX anti-pattern in Android. It causes the soft keyboard to trigger on tap, which is unexpected for navigation and obstructs the user's view.
**Action:** Use `TextView` for static navigation items. Apply `android:clickable="true"` and `android:focusable="true"` to maintain accessibility, and use `?android:attr/selectableItemBackground` for standard touch feedback. Preserve original IDs if necessary to avoid breaking ViewBinding/Activity logic.
