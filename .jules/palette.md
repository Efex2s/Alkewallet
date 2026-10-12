# Palette UX & Accessibility Journal

## 2025-10-12 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` fields with `android:hint` as click targets/navigation options in Android menus creates bad accessibility and user experience. Screen readers announce them as editable text boxes, users are prompted with software keyboards when tapped, and text hints render with subdued contrast colors.
**Action:** Always use non-editable `TextView` components for menu options or navigation items in Android layouts, configured with `android:text`, `android:textColor`, `android:clickable="true"`, `android:focusable="true"`, and touch ripple backgrounds (`?attr/selectableItemBackground`).
