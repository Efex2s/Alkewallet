## 2024-05-23 - Navigational EditText Anti-pattern
**Learning:** Using `EditText` as a navigational menu item is a common anti-pattern in this codebase. It causes the soft keyboard to trigger unnecessarily, which is disruptive for the user. Additionally, hardcoding spaces in `hint` or `text` to provide indentation is brittle.
**Action:** Always replace navigational `EditText` with `TextView`, add `?attr/selectableItemBackground` for ripple feedback, and use `paddingStart` and `drawablePadding` for proper alignment.
