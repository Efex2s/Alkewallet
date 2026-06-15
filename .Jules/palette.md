## 2024-06-15 - Profile Menu Refactor: EditText to TextView
**Learning:** Using `EditText` for navigation items is a poor UX choice as it triggers the soft keyboard unnecessarily and misleads users about editability. Replacing them with semantic `TextViews` improves clarity and prevents unwanted keyboard popups.
**Action:** Always use `TextView` or standard List/Menu components for navigation items, even if they need a trailing icon. Use `selectableItemBackground` for visual feedback.

## 2024-06-15 - Accessibility in Icon-Only Buttons
**Learning:** ImageButtons without `contentDescription` are invisible to screen reader users.
**Action:** Always provide `android:contentDescription` for `ImageButton` and `ImageView` that serve as interactive elements.
