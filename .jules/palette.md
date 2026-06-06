## 2025-05-14 - Refactoring navigational items from EditText to TextView
**Learning:** Using `EditText` for navigational menu items in Android is a significant UX anti-pattern; it triggers the soft keyboard unnecessarily and fails to provide standard touch feedback. `TextView` with a borderless button style provides a more intuitive, non-editable interaction and supports ripples out-of-the-box.
**Action:** Always use `TextView` or `Button` for navigational items and extract consistent styling into `themes.xml` to ensure visual and interactive uniformity across list-like menus.
