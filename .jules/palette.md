# Palette UX Journal

## 2026-08-22 - Touch Target and Focusable Ripple Enhancements on Interactive TextViews
**Learning:** Text-based navigation links or actions rendered as plain `TextView` elements often default to tight padding and lack click/focus metadata, leading to small tap targets on mobile screens and missing keyboard/focus visual feedback.
**Action:** When using `TextView` elements for navigation or actions in Android layout XML, always provide explicit touch target padding (e.g., `android:padding="12dp"`), set `android:clickable="true"` and `android:focusable="true"`, and apply `android:background="?attr/selectableItemBackground"` for interactive ripple feedback.
