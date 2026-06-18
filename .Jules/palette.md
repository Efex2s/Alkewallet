## 2024-05-15 - [Avoid EditText for Navigation]
**Learning:** Using `EditText` for items that are meant for navigation (like menu options) is a poor UX choice as it unnecessarily triggers the soft keyboard, interrupting the user flow. `TextView` with a selectable background is the semantic and functional alternative for such patterns.
**Action:** Always use `TextView` (or `Button`) for navigation-only list items and ensure they provide visual feedback (e.g., `selectableItemBackground`).
