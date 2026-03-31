## 2025-05-15 - Legibility over Distortion
**Learning:** Using `android:textScaleX` to emphasize text (like transaction amounts) distorts the font's aspect ratio, making it harder to read and visually inconsistent with the rest of the app's typography.
**Action:** Replace `android:textScaleX` with `android:textStyle="bold"` and color-coding to achieve emphasis while maintaining font integrity.
