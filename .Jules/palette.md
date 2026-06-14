# Palette's Journal - Critical UX/Accessibility Learnings

This journal documents critical UX and accessibility insights discovered during the development of this application.

## 2025-05-14 - [UX improvement] Refactored Profile Menu items to TextView
**Learning:** Using `EditText` for navigation-only menu items is a UX anti-pattern as it unnecessarily triggers the soft keyboard and confuses the user about the item's purpose.
**Action:** Always use semantic `TextViews` with `android:background="?android:attr/selectableItemBackground"` for navigation menus to ensure a smooth interaction and proper visual feedback.
