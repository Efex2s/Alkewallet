## 2025-05-18 - Replacing EditText with TextView for Navigation Items
**Learning:** Using `EditText` fields with hints for static menu items is an accessibility anti-pattern in Android layouts. It causes screen readers to announce editable input fields rather than interactive navigation links.
**Action:** Convert navigation list items from `EditText` to focusable `TextView` components with explicit text resources, vertical centering, and `?attr/selectableItemBackground` ripples.
