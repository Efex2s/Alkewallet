## 2026-03-30 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` for non-editable navigation choices triggers screen reader editable text semantics and pops up soft keyboards unexpectedly when tapped by users.
**Action:** Replace navigation items with focusable, clickable `TextView` controls that utilize proper string resources (`android:text`), compound drawables, and `?attr/selectableItemBackground` touch feedback.
