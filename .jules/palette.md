# Palette UX Journal

## 2024-07-18 - EditText as Navigation Item Anti-Pattern
**Learning:** Using static `EditText` views for navigation menu options is a major UX and accessibility anti-pattern. Interacting with them brings up the virtual keyboard unnecessarily and confuses assistive technologies regarding the element's actual role. Converting navigation items to `TextView` with explicit clickability, focusability, and `selectableItemBackground` touch ripple feedback provides expected navigation semantics and prevents virtual keyboard disruption.
**Action:** Always refactor text-based static navigation or menu items to `TextView` with `selectableItemBackground` rather than leaving them as raw `EditText` components.
