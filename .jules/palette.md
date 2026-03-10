## 2024-05-24 - [Refactor Navigation from EditText to TextView]
**Learning:** Using `EditText` for static navigation items is a poor UX pattern that triggers the soft keyboard unnecessarily and lacks appropriate semantic meaning for screen readers. Replacing them with `TextView` while maintaining the same IDs avoids breaking `ViewBinding` or code references.
**Action:** Always check if interactive items are correctly using `TextView` or `Button` instead of `EditText` for navigation-like actions.
