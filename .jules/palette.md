## 2025-05-14 - [Profile Menu UX Refactor]
**Learning:** Using EditText for navigation menu items is a UX anti-pattern as it erroneously triggers the soft keyboard and suggests editability where only navigation is intended. Switching to TextView with ripple feedback (?attr/selectableItemBackground) provides better interaction semantics.
**Action:** Always use TextView or Button for non-editable navigation items. Ensure icon-only interactive elements have circular ripple feedback and clear accessibility descriptions.
