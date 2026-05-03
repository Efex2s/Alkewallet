## 2026-05-03 - Improved Profile Menu Semantic and Interaction
**Learning:** Using `EditText` for navigation or static menu items is a common anti-pattern in Android that negatively impacts UX by triggering the soft keyboard unnecessarily and providing no visual touch feedback.
**Action:** Always use `TextView` or `Button` for navigational items. Apply `?attr/selectableItemBackground` for standard ripple feedback and ensure `clickable="true"` and `focusable="true"` are set for accessibility services.
