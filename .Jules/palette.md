## 2025-05-15 - [Refactor profile menu for better UX and accessibility]
**Learning:** Using 'EditText' for static navigation items is a significant accessibility and UX anti-pattern as it triggers unnecessary soft keyboards and misleads screen readers.
**Action:** Always use semantic 'TextViews' for navigational menu items, applying 'selectableItemBackground' for visual feedback and 'contentDescription' for screen reader clarity. Externalize strings to 'strings.xml' to support localization and maintainability.
