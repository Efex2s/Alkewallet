## 2026-04-29 - [Profile Menu UX Refactor]
**Learning:** Using `EditText` for static navigation items is a UX anti-pattern that triggers the keyboard unnecessarily. Converting them to `TextView` with `?attr/selectableItemBackground` provides better feedback and accessibility.
**Action:** Always use `TextView` for non-editable list items and ensure `app:drawableStartCompat`/`app:drawableEndCompat` are used for vector icons in `AppCompat` projects.
