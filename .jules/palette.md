## 2026-03-31 - Semantic Navigation vs Input Controls
**Learning:** Using `EditText` widgets as interactive navigation items causes immediate confusion and disruption: clicking an item focuses an editable field and inappropriately opens the soft keyboard instead of performing navigation.
**Action:** Always use semantic non-editable controls like `TextView` or `Button` for menu items, explicitly specifying `android:clickable="true"`, `android:focusable="true"`, `android:background="?attr/selectableItemBackground"`, and clear accessibility descriptions (`contentDescription`).
