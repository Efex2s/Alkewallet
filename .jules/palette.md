# Palette's UX Journal

## 2024-05-18 - Replacing Pseudo-Button EditTexts with Accessible TextViews
**Learning:** Using `EditText` elements as navigation menu items or buttons introduces severe accessibility and usability anti-patterns: screen readers announce them as editable text input fields and they can trigger software keyboards or editing handles instead of navigation. In addition, relying on `hint` instead of `text` leads to poor color contrast and improper semantics.
**Action:** Always use semantic `TextView` (or `Button` / `MaterialButton`) with `android:clickable="true"`, `android:focusable="true"`, `android:background="?attr/selectableItemBackground"`, explicit `android:text` string resources, and `android:textColor` for clickable menu and list rows.
