## 2024-05-24 - Navigation Anti-pattern and Accessibility
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern in Android as it triggers the soft keyboard unexpectedly. Refactoring to `TextView` improves usability. Additionally, icon-only interactive elements must have `contentDescription` for screen reader accessibility.
**Action:** Always use `TextView` or `Button` for navigation links and ensure all `ImageButton` or `ImageView` click targets have descriptive labels.
