## 2025-01-24 - [EditText as Navigation Item Anti-pattern]
**Learning:** Using `EditText` for navigation menu items in Android is a poor UX practice. It triggers the soft keyboard unintentionally, lacks proper semantic announcements for screen readers, and requires hacky solutions (like leading spaces) for visual alignment.
**Action:** Always use `TextView` or `MaterialButton` for navigation items. Ensure they have `android:background="?attr/selectableItemBackground"` for touch feedback and proper `gravity` for alignment.

## 2025-01-24 - [Accessibility for Icon-only Buttons]
**Learning:** Icon-only buttons (like `ImageButton`) are invisible to screen readers if they lack a `contentDescription`.
**Action:** Always provide a descriptive `android:contentDescription` for `ImageButton` and `ImageView` elements that perform actions.
