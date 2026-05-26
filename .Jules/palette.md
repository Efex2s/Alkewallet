## 2025-05-26 - Prevent Keyboard Triggers on Navigational Menus

**Learning:** Using `EditText` for navigational menu items in Android is a poor UX choice as it triggers the soft keyboard upon focus or click. Replacing them with `TextView` (or `Button`) with `selectableItemBackground` preserves the visual style while ensuring a smooth navigation experience without unnecessary keyboard interruptions.

**Action:** Always use `TextView` or `Button` for menu items that trigger navigation or actions, rather than `EditText` with hints.
