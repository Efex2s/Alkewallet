# Palette Journal - UX & Accessibility Learnings

## 2024-05-19 - Navigational Menu Components
**Learning:** Using `EditText` for navigational or static menu items is a UX anti-pattern as it triggers the soft keyboard, interrupting the user flow. `TextView` with appropriate ripple feedback and accessibility attributes is the correct semantic choice.
**Action:** Always audit layouts for `EditText` elements used as buttons/links. Refactor to `TextView` and apply `?attr/selectableItemBackground` for interactive feedback.
