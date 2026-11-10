# Palette UX Journal

## 2026-10-05 - Navigation Items Using EditText Anti-Pattern
**Learning:** Using `EditText` components for read-only navigation list items causes soft keyboards to open on tap, emits incorrect input accessibility traits for screen readers, and creates poor user interaction.
**Action:** Always use clickable and focusable `TextView` components with `android:background="?attr/selectableItemBackground"`, `android:gravity="center_vertical"`, and explicit `android:drawablePadding` for menu and navigation list items.
