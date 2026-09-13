## 2024-05-20 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` with `android:hint` for menu options causes soft keyboards to unnecessarily pop up when users click navigation items, degrading accessibility and user experience.
**Action:** Replace `EditText` navigation items with semantic `TextView` components, using `android:text`, proper drawable padding, `gravity="center_vertical"`, and touch feedback (`selectableItemBackground`).
