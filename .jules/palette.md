# Palette UX Journal

## 2024-09-22 - Non-editable Navigation Items Implemented as EditText
**Learning:** In Android XML layouts, using `<EditText>` with hints for menu navigation items causes accessibility screen readers to announce them as editable text boxes and triggers soft keyboards when clicked. Converting menu items to `<TextView>` components with explicit touch ripples (`?attr/selectableItemBackground`), padding, and start drawables ensures proper accessibility semantics and interactive touch feedback.
**Action:** Always check navigation and setting list screens for misuse of `EditText` views and convert them to interactive `TextView` items with semantic text and accessibility traits.
