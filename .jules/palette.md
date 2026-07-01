## 2025-07-01 - Navigation Item Anti-pattern
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern as it triggers the keyboard and lacks standard navigation feedback. Refactoring to `TextView` with `selectableItemBackground` and ensuring both `clickable` and `focusable` are true provides a more standard and accessible UX.
**Action:** Always check navigation lists for incorrect `EditText` usage and replace with `TextView`.

## 2025-07-01 - Content Descriptions for Interactive Images
**Learning:** Icon-only buttons and interactive `ImageView`s without `contentDescription` are invisible to screen reader users.
**Action:** Audit all `ImageButton` and interactive `ImageView` elements for missing `contentDescription`.
