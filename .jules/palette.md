## 2025-05-15 - Interactive Icon Accessibility and Feedback
**Learning:** Using `ImageView` for interactive elements without background attributes results in a lack of visual feedback (ripples), making the UI feel static and unresponsive. Additionally, icon-only buttons require explicit `contentDescription` for screen reader accessibility.
**Action:** Always use `ImageButton` for interactive icons, or at least apply `?attr/selectableItemBackgroundBorderless` to `ImageView` with `clickable="true"`. Ensure every interactive icon has a localized `@string` resource for its `contentDescription`.
