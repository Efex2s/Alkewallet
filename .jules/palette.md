## 2025-05-14 - Refactoring navigation menus for better accessibility and UX
**Learning:** Using `EditText` for navigation menu items is a poor practice because it incorrectly triggers the soft keyboard and misleads screen readers about the element's purpose, as they are announced as input fields.
**Action:** Always use `TextView` or `Button` for non-input interactive elements. For `TextView` acting as a button, ensure `android:background="?attr/selectableItemBackground"`, `android:clickable="true"`, and `android:focusable="true"` are set to provide correct visual feedback and accessibility.
