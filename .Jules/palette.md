## 2024-05-14 - Navigation Item Refactoring
**Learning:** Using `EditText` for navigation menu items causes the soft keyboard to trigger unexpectedly, creating a jarring UX. Converting them to `TextView` with `android:clickable="true"` and `android:focusable="true"` maintains interactivity while preventing keyboard focus.
**Action:** Use `TextView` for static or navigational list items. Apply `?attr/selectableItemBackground` for standard ripple feedback and ensure `app:drawableStartCompat` is used for icons to maintain compatibility.

## 2024-05-14 - Android Compatibility and Theming
**Learning:** Hardcoding colors (e.g., `@color/black`) can break accessibility in Dark Mode. Similarly, using modern attributes like `paddingHorizontal` (API 26+) without proper fallbacks can lead to issues on older devices.
**Action:** Use theme attributes like `?android:attr/textColorPrimary` for text colors and prefer `paddingStart`/`paddingEnd` for backward compatibility and RTL support.
