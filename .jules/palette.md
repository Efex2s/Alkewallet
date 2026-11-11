# Palette UX Journal

## 2025-05-15 - Profile Navigation Menu Refactoring
**Learning:** Using `EditText` for menu navigation items is an accessibility and UX anti-pattern; it misrepresents interactive options as editable fields and erroneously pops up the software keyboard when tapped. Instead, using styled `TextView` elements with `android:clickable="true"`, `android:focusable="true"`, `android:gravity="center_vertical"`, and `?attr/selectableItemBackground` provides clear navigation semantics, appropriate touch targets, and visual ripple feedback.
**Action:** When auditing Android screen layouts, ensure that purely navigational list items use non-editable clickable components (`TextView`/`Button`) with localized string resources and accessible visual states.
