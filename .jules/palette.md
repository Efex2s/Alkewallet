## 2024-05-24 - [Dashboard Accessibility and Styling]
**Learning:** Using `android:textScaleX` to emphasize currency or amounts leads to distorted glyphs and poor readability. Additionally, missing accents in Spanish string resources (e.g., 'Ultimas' vs 'Últimas') reduces the professional feel and clarity of the UI.
**Action:** Always use semantic text styling (e.g., `android:textStyle="bold"`) and proper language accents. Ensure all interactive icons have `contentDescription` and ripple feedback (`selectableItemBackgroundBorderless`) to meet basic accessibility standards.
