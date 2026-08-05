# Palette Journal

## 2026-02-05 - Refactor EditText Navigation Items in Mi Perfil
**Learning:** Using `EditText` for static navigation menu options is a major UX and accessibility anti-pattern. Tapping it invokes a soft keyboard, permits unintended text modification, and presents incorrect accessibility traits to screen readers. Replacing them with `TextView` elements that utilize proper focus and ripple states (`?android:attr/selectableItemBackground`) resolves this cleanly.
**Action:** Always audit menu and navigation list items for raw `EditText` components and replace them with interactive `TextView` or custom Button elements with appropriate visual feedback.
