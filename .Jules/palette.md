# Palette Journal

## 2024-04-27 - Initializing Palette UX Journal
**Learning:** Foundational learning tracking is essential for continuous UX and accessibility improvement across our Android codebase.
**Action:** Always document discoveries related to irregular touch feedback, content descriptions, and form wrappers.

## 2024-04-27 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` for non-editable menu/navigation items in Android causes the soft keyboard to pop up unnecessarily, confusing screen readers and frustrating keyboard users. Using focusable, clickable `TextView` elements with visual selectableItemBackground feedback provides a cleaner and much more accessible native experience.
**Action:** Always refactor non-editable list/menu options from `EditText` to clickable `TextView` views and ensure they have adequate drawables, paddings, and description strings.
