## 2024-05-24 - Navigation Anti-pattern: EditText as Buttons
**Learning:** Using `EditText` for navigation menu items is a significant UX anti-pattern as it triggers the soft keyboard, interrupting the user flow. Additionally, icon-only buttons without `contentDescription` are inaccessible to screen reader users.
**Action:** Always use `TextView` or `Button` for interactive navigation elements. Ensure all icon-only interactive elements have descriptive `contentDescription` attributes and provide visual touch feedback using `selectableItemBackground`.
