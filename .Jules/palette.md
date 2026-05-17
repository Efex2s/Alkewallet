## 2024-05-14 - Use TextView for Static Menu Items
**Learning:** Using `EditText` for navigational menu items in Android causes the soft keyboard to trigger unnecessarily, which is a poor user experience. `TextView` with ripple feedback is the correct component for these interactions.
**Action:** Always use `TextView` (or `Button` if appropriate) for static or navigational menu items. Ensure `android:clickable="true"` and `android:focusable="true"` are set for accessibility.
