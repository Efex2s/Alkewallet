## 2024-05-15 - [Refactor Navigation Menus from EditText to TextView]
**Learning:** Refactoring menu items from EditText to TextView in Android prevents the soft keyboard from erroneously appearing, improving interaction semantics and accessibility.
**Action:** Always check if interactive list-like items are using appropriate View types (TextView/Button) instead of input types (EditText) to ensure a smooth user experience.
