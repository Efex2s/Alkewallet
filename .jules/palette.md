## 2025-05-15 - Refactoring Navigation Menu Items

**Learning:** Using `EditText` for navigation menu items is a UX anti-pattern. It erroneously triggers the soft keyboard when a user intends to navigate, and the "hint" text suggests the field is editable, which is misleading for static menu options.

**Action:** Always use `TextView` (or `Button`) for non-input interactive elements. Ensure they have visual feedback (ripple effects via `?android:attr/selectableItemBackground`), clear accessibility labels (`contentDescription`), and meet minimum touch target sizes (at least 48dp).
