## 2025-02-18 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` for static menu navigation options creates accessibility issues and confusing UX on screen readers, as focusable editable input semantics are exposed for non-editable navigation items.
**Action:** Always replace navigation menu `EditText` elements with `TextView` or standard clickable components, supplying explicit `android:clickable="true"`, `android:focusable="true"`, touch ripple background (`?attr/selectableItemBackground`), and semantic text strings.
