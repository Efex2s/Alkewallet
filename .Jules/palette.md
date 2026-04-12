## 2025-05-15 - Navigation Menu Item Semantics
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. Always use `TextView` or `Button` with visual feedback (ripple) and clear contentDescription for menu items.
**Action:** Audited and refactored the Profile screen to replace deceptive `EditText` components with accessible, interactive `TextView` elements.
