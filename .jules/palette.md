# Palette's Journal - Critical UX/Accessibility Learnings

## 2025-05-15 - [Refactoring Profile Menu Items]
**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern as it incorrectly triggers the soft keyboard and suggests the content is editable. `TextView` or `Button` with clear interactive feedback (ripple) is the standard and more accessible choice.
**Action:** Replace navigational `EditText` with `TextView` or `Button` to improve semantics and prevent unintended keyboard activation.
