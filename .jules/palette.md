## 2025-05-15 - Profile Menu Component Refactor
**Learning:** Using `EditText` for non-editable navigation menu items is a UX anti-pattern as it triggers the soft keyboard, causing layout shifts and user confusion. `TextView` with `selectableItemBackground` and `contentDescription` provides the correct interactive semantics.
**Action:** Always prefer `TextView` or `Button` for menu items that trigger navigation rather than text entry.
