## 2025-03-06 - Semantic UI components and Accessibility

**Learning:** Using `EditText` for navigation menus is a poor UX pattern in Android as it triggers the soft keyboard and misleads users about the element's purpose. Replacing them with `TextView` improves semantic clarity. Additionally, interactive icons (ImageView) must be explicitly marked as `clickable` and `focusable` while providing `contentDescription` for screen readers.

**Action:** Always verify the purpose of a UI element before choosing its component type. For static navigation, use `TextView` with `selectableItemBackground`. Ensure all interactive elements have accessibility labels.
