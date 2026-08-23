# Palette's UX Journal

## 2025-05-18 - Touch Target Accessibility and Visual Feedback for Interactive TextViews
**Learning:** Interactive `TextView` components functioning as text buttons or navigation links often lack explicit touch target padding and visual tap feedback (`?attr/selectableItemBackground`), making them difficult to tap on mobile devices and leaving users unsure if their interaction registered.
**Action:** Always add `android:padding="12dp"`, `android:clickable="true"`, `android:focusable="true"`, and `android:background="?attr/selectableItemBackground"` to interactive navigation `TextView`s to meet accessibility guidelines (minimum 48dp touch target size) and provide clear visual feedback on tap.
