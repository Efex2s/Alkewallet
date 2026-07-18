# Palette UX Journal

## 2024-07-18 - EditText as Navigation Item Anti-Pattern
**Learning:** Found that using static `EditText` views for profile list navigation menu options represents a severe UX and accessibility anti-pattern. Clicking these items erroneously opens the soft keyboard, disrupting the navigation flow and screen reader focus. Converting them to focusable, clickable `TextView` elements with visual touch ripples prevents the soft keyboard from displaying while offering correct accessibility roles.
**Action:** Always refactor text-based static navigation/menu options to `TextView` with `selectableItemBackground` rather than leaving them as raw `EditText` components.
