# Palette UX Journal

## 2026-08-09 - Converted EditText Navigation Items to TextViews
**Learning:** Using `EditText` as interactive profile menu navigation items is an accessibility and user experience anti-pattern, causing the soft keyboard to appear. Converting them to focusable and clickable `TextView` components improves focus semantic, touch feedback, and screen reader announcements.
**Action:** Always replace editable text input elements with custom `TextView` elements when they are serving as simple navigation menu options.
