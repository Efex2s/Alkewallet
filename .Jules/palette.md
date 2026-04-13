## 2025-05-15 - Improving Profile Menu Semantics
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. Always use `TextView` or `Button` with visual feedback (ripple) and clear `contentDescription` for a more intuitive and accessible experience.
**Action:** Replace semantically incorrect `EditText` menu items with `TextView`, ensuring `clickable="true"`, `focusable="true"`, and appropriate touch feedback are provided.
