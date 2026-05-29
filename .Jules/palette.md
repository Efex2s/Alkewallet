## 2025-05-14 - Refactoring Navigational EditText to TextView

**Learning:** Using `EditText` for navigational menu items is a major UX anti-pattern as it triggers the soft keyboard and lacks proper button semantics. Refactoring them to `TextView` with `Widget.AppCompat.Button.Borderless` style provides the correct behavior and visual ripple feedback.

**Action:** When encountering `EditText` used as buttons, refactor them to `TextView`. Preserve original IDs if they might be referenced in code, and use styles to keep layout files clean and under the 50-line change limit. Use `app:drawableStartCompat` for vector/raster compatibility.
