## 2024-07-15 - EditText as Navigation Item Anti-pattern
**Learning:** Using `EditText` for static navigation menu items is a major UX and accessibility flaw. It triggers the soft keyboard when tapped, which is confusing and frustrating for users who expect to navigate. It also lacks the semantic meaning of a button or a navigation link.
**Action:** Replace `EditText` with `TextView` (or `Button`/`MenuItem`) for navigation components. Ensure they have `selectableItemBackground` for touch feedback and proper accessibility labels.
