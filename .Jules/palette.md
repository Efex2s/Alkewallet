## 2025-01-24 - Safe Refactoring of Navigational EditTexts to TextViews
**Learning:** Replacing navigational `EditText` components with `TextView` improves UX by preventing keyboard triggers and cursor display. This is safe if global `grep` confirms the IDs are not referenced in Java code, avoiding `ClassCastException` in ViewBinding or `findViewById`.
**Action:** Always verify ID usage in code before changing View types in XML layouts.
