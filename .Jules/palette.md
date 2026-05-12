# Palette's Journal - Critical Learnings Only

This journal contains critical UX and accessibility learnings discovered during the development process.

## 2024-05-23 - Avoid keyboard triggers on navigation items
**Learning:** Using `EditText` for items that are intended for navigation (like menu options in a Profile screen) causes the soft keyboard to trigger unnecessarily when the user taps them. This creates a jarring UX and covers a significant portion of the screen.
**Action:** Use `TextView` (or specialized list items) with `android:clickable="true"` and `android:focusable="true"` for navigational elements. Apply `?attr/selectableItemBackground` for visual touch feedback.
