## 2025-01-24 - Semantic View Selection for Navigation
**Learning:** Using `EditText` for navigational menu items in Android is a poor UX pattern as it triggers the soft keyboard, creating friction. Replacing them with `TextView` with `selectableItemBackground` provides the correct semantic behavior and touch feedback without unnecessary keyboard interactions.
**Action:** Always prefer `TextView` or `Button` for static menu lists; use `?android:attr/textColorPrimary` to maintain accessibility in both Light and Dark modes.
