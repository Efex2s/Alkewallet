# Palette UX Journal

## 2025-05-18 - Replacing Navigation EditTexts with TextViews for Accessibility and Focus Behavior
**Learning:** Using `EditText` for menu navigation items is an anti-pattern: it brings up the soft keyboard when tapped instead of performing menu navigation, lacks proper text color contrast when using hints, and creates an unintuitive screen-reader experience.
**Action:** Always use `TextView` (or `Button`/`ListPreference`) with `android:clickable="true"`, `android:focusable="true"`, `android:gravity="center_vertical"`, and `android:background="?attr/selectableItemBackground"` for interactive list navigation items.
