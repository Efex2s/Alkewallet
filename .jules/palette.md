## 2025-02-23 - Avoiding EditText for Navigation Items
**Learning:** Using `EditText` as a navigation menu button causes confusion for screen readers (which read hints instead of text) and triggers unnecessary soft keyboards on focus. Replacing them with `TextView` containing explicit text, touch ripples (`?attr/selectableItemBackground`), and keyboard focusability creates a standard, accessible navigation experience.
**Action:** When designing menu lists, always use `TextView` with `clickable="true"`, `focusable="true"`, and appropriate string resources rather than editable text fields.
