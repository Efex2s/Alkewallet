## 2024-05-24 - Navigation Anti-Pattern: EditText for Menu Items
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern. It erroneously triggers the soft keyboard, which is frustrating for users, and visually suggests editability where only navigation is intended.
**Action:** Always use `TextView` or `Button` for navigation items. Ensure they have visual feedback (like ripples) and clear `contentDescription` for accessibility.
