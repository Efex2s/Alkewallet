## 2025-07-26 - Journal Initialization
**Learning:** Initialized Palette journal for UX/accessibility learnings.
**Action:** Always verify user interaction flows, focus states, and screen reader labels.

## 2025-07-26 - Profile Menu Accessibility and UX Refactor
**Learning:** Using raw `EditText` widgets for static navigation menu items is a major UX anti-pattern that mistakenly pops up the soft keyboard, confuses users visually, and breaks accessibility announcements (as they are read as editable fields instead of clickable links). Replacing them with `TextView` elements that support `selectableItemBackground` backgrounds, explicit `clickable/focusable="true"`, and descriptive localized `contentDescription` attributes creates an intuitive, native, and screen-reader friendly navigation experience.
**Action:** Always audit profile or settings lists for incorrect input widgets used for navigation and replace them with standard `TextView` or list item patterns with ripple feedback and custom accessibility text.
