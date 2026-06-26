## 2024-05-23 - Standardizing Profile Navigation Items
**Learning:** Using `EditText` for static navigation menu items is a UX anti-pattern as it triggers the soft keyboard and implies editability where none exists. `TextView` with `selectableItemBackground` and `drawablePadding` provides a much cleaner and more accessible navigation experience.
**Action:** Always use `TextView` or specialized list item components for navigation menus. Ensure `clickable="true"` and `focusable="true"` are set for accessibility.

## 2024-05-23 - Modernizing Back Navigation
**Learning:** `onBackPressed()` is deprecated in modern Android SDKs (34+). The modern approach is `getOnBackPressedDispatcher().onBackPressed()`.
**Action:** Use `OnBackPressedDispatcher` for activity-level back navigation to ensure compatibility with modern Android navigation patterns.
