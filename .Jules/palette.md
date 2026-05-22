# Palette Journal

Critical UX and accessibility learnings for the AlkeWallet Android application.

## 2024-05-22 - Navigational Menu Components
**Learning:** Using `EditText` for navigational menu items (as seen in the profile screen) is a poor UX choice as it triggers the soft keyboard unnecessarily when the user intends to navigate. `TextView` with `?attr/selectableItemBackground` provides the same visual structure while ensuring a smoother interaction.
**Action:** Always prefer `TextView` (or `MaterialButton` for more complex cases) for static or navigational list items to prevent unwanted keyboard behavior.
