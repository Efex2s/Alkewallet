## 2026-01-31 - Static EditText as Navigation Link Anti-Pattern
**Learning:** Using raw `EditText` widgets for static navigation links violates accessibility and ruins the interactive experience by opening virtual keyboards and misleading screen readers. Replacing them with clickable, focusable `TextView`s with ripple bounds matches human navigation intuition perfectly.
**Action:** Always audit profile layouts for static links implemented via editable elements and convert them to semantic click targets using `TextView` with `?attr/selectableItemBackground`.
