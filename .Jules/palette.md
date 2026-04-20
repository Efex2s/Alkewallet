## 2026-04-14 - Improve navigation menu semantics and UX
**Learning:** Using `EditText` for static navigation menu items causes confusing UX as it triggers the soft keyboard and allows text input. `TextView` with `selectableItemBackground` provides better semantics and a clearer "button-like" feel for navigation links.
**Action:** Always use `TextView` (or `Button`) instead of `EditText` for interactive menu items that navigate to other parts of the app to avoid accidental keyboard triggers.
