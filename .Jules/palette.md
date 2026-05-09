## 2025-01-24 - Navigation Item Selection
**Learning:** Using `EditText` for navigational or static menu items is a poor UX pattern as it unnecessarily triggers the soft keyboard and implies mutability where none exists. Replacing them with `TextView` (or `Button`) provides a cleaner interaction and avoids keyboard-related layout shifts.
**Action:** Always prefer `TextView` for menu lists and ensure interactive feedback is provided via `?attr/selectableItemBackground`.
