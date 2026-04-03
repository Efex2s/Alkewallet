## 2025-05-15 - [Profile menu refactor]
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. Always use `TextView` or `Button` with visual feedback (ripple) and clear `contentDescription`.
**Action:** Always check the semantics of interactive elements to ensure they match their function (e.g., navigation vs. input). Use standard ripple backgrounds and accessibility descriptions for all clickable views.
