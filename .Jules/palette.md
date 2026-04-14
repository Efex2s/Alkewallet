## 2025-05-15 - Improving Home Page Accessibility and Typography

**Learning:** Using `android:textScaleX` to enlarge text distorts the font's aspect ratio, leading to poor legibility and a non-standard appearance. Additionally, using `match_parent` for icon-only touch targets can lead to accidental triggers if the container is wider than the icon.

**Action:** Always use `android:textSize` and `android:textStyle` for text emphasis instead of `textScaleX`. Ensure icon buttons have `android:layout_width="wrap_content"` or fixed dimensions with adequate padding/ripple to maintain a predictable and accessible touch target.
