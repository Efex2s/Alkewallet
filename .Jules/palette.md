## 2026-05-14 - Improve navigation item semantics and compatibility

**Learning:** Using `EditText` for navigation menu items is an anti-pattern that triggers the soft keyboard unnecessarily and misleads screen readers. Replacing them with `TextView` improves both UX and accessibility. Additionally, using `app:drawableStartCompat` and `app:drawableEndCompat` is required for proper icon rendering on older API levels when using `AppCompat`.

**Action:** Always use `TextView` for static or navigational list items. Apply `?attr/selectableItemBackground` for feedback, and ensure `clickable="true"` and `focusable="true"` are set. Use `Compat` attributes for drawables in `TextView`.
