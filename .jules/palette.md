# Palette UX Journal

## 2025-05-18 - Anti-Pattern: Using EditText for Navigation Menu Items
**Learning:** Using `EditText` components as clickable navigation menu rows creates significant usability and accessibility confusion because screen readers announce them as editable text fields, software keyboards may trigger unnecessarily, and editable styling misleads users about interactive intent.
**Action:** Always use `TextView` components for menu items, styled with `android:clickable="true"`, `android:focusable="true"`, `android:background="?attr/selectableItemBackground"`, and explicit `android:gravity="center_vertical"` with touch padding.
