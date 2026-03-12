## 2025-05-14 - Semantic Menu Components
**Learning:** Using `EditText` for non-editable navigation menu items is a poor UX pattern that triggers the soft keyboard unnecessarily and confuses screen readers.
**Action:** Always use `TextView` (or specialized components) for menu items with `selectableItemBackground` for visual feedback and `contentDescription` for accessibility.
