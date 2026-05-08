## 2024-06-05 - Misuse of EditText for navigation
**Learning:** Using `EditText` for static or navigational menu items is a UX anti-pattern as it triggers the soft keyboard unnecessarily and confuses accessibility services.
**Action:** Use `TextView` for non-editable navigational items, and ensure they have `focusable="true"`, `clickable="true"`, and appropriate ripple feedback (`?android:attr/selectableItemBackground`).
