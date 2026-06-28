## 2025-05-14 - [Profile Screen Refactoring]
**Learning:** Using `EditText` for navigation items is a significant UX anti-pattern as it triggers the soft keyboard unnecessarily and misleads users about the element's function. Replacing them with `TextView` while maintaining the original IDs is a safe and effective way to fix this in ViewBinding-enabled projects.
**Action:** Always check if input widgets are being used for navigation and refactor them to `TextView` with proper accessibility attributes (`clickable`, `focusable`, `contentDescription`).
