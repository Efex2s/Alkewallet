## 2024-04-28 - [Semantic Navigation Elements]
**Learning:** Using `EditText` for navigation menu items causes a poor UX by unnecessarily triggering the soft keyboard and confusing screen readers. `TextView` with `selectableItemBackground` provides the correct semantic interaction and visual feedback.
**Action:** Always check if interactive list items are incorrectly using input-focused widgets like `EditText` and refactor them to `TextView` or `Button`.
