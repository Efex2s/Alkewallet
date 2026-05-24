## 2026-05-24 - Use TextView for Navigational Menu Items
**Learning:** Using `EditText` for static or navigational menu items (like in a profile screen) is a poor UX choice as it triggers the soft keyboard unnecessarily when the user taps it to navigate. `TextView` with a selectable background provides the same visual feedback without the keyboard annoyance.
**Action:** Always prefer `TextView` for items that lead to other screens or perform actions, and ensure they have `android:background="?android:attr/selectableItemBackground"` for touch feedback.
