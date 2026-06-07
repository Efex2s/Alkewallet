## 2024-05-15 - Refactoring Input Elements for Navigation
**Learning:** Using `EditText` for navigational elements (like menu items) is a poor UX pattern because it triggers the soft keyboard and misleads assistive technologies. `TextView` with ripple feedback is the correct semantic choice for list-based navigation.
**Action:** Always prefer `TextView` with `?android:attr/selectableItemBackground` for static menu items that act as buttons.

## 2024-05-15 - Accessibility in Icon Buttons
**Learning:** `ImageButton` components without `contentDescription` are invisible to screen reader users.
**Action:** Ensure every `ImageButton` has a descriptive `android:contentDescription` to explain its action (e.g., "Back").
