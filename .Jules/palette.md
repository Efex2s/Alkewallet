## 2024-04-21 - [Semantic View Selection]
**Learning:** Using `EditText` for navigation menu items is a significant UX flaw as it triggers the soft keyboard, interrupting the navigation flow and confusing users who expect a navigation action.
**Action:** Always use `TextView` or `Button` for static navigation items. Ensure they are marked as clickable/focusable and provide visual touch feedback (e.g., `?attr/selectableItemBackground`).

## 2024-04-21 - [Typography Standards]
**Learning:** The `android:textScaleX` attribute horizontally stretches text, which distorts the font's aspect ratio and negatively impacts legibility and aesthetic quality.
**Action:** Avoid `android:textScaleX` for emphasis. Instead, use standard typography attributes like `android:textStyle="bold"` and `android:textSize` to achieve visual hierarchy.
