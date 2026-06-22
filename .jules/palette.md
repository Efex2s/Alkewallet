## 2024-06-22 - EditText for Navigation Anti-pattern
**Learning:** Using `EditText` for navigation menu items causes the soft keyboard to pop up unnecessarily, disrupting the user flow. `TextView` with `selectableItemBackground` should be used instead for a consistent and non-intrusive navigation experience.
**Action:** Always use `TextView` for static menu items that act as triggers for navigation, ensuring `clickable` and `focusable` attributes are set to true for accessibility.
