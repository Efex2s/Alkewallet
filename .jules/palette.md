## 2026-03-30 - Anti-Pattern: EditText as Navigation Menu Items
**Learning:** Using `EditText` views for navigation menu options in Android layouts causes accessibility tools to announce them as editable fields, causes soft keyboards to spawn inadvertently, and leads to dim hint text rather than primary text.
**Action:** Replace navigation `EditText` elements with `TextView` views configured with `android:clickable="true"`, `android:focusable="true"`, `android:background="?attr/selectableItemBackground"`, and explicit `@string` resources.
