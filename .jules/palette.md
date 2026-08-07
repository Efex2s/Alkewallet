# Palette UX Journal

## 2026-03-01 - Profile Menu EditText-to-TextView Refactor
**Learning:** Using EditText as static navigation items in a profile menu is a significant UX anti-pattern because it pops up the soft keyboard, disrupting user expectations. Converting them to TextView components with `android:clickable="true"`, `android:focusable="true"`, and `android:background="?android:attr/selectableItemBackground"` provides clear ripple/touch feedback, maintains accessibility/keyboard tab navigation, and avoids unwanted keyboard display.
**Action:** Always use TextView or Button for navigation menu lists instead of EditText. Ensure proper padding (`android:paddingStart`), gravity (`android:gravity="center_vertical"`), and drawable alignment to preserve high-fidelity styling.
