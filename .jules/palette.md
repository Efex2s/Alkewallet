# Palette UX Journal

## 2025-05-18 - Stretched Typography and Unlabelled Icons in Financial Feed

**Learning:** Heavy horizontal font stretching (`textScaleX="2"`) compromises legibility on financial transaction amounts and leads to visual artifacts on higher DPI screens. Additionally, interactive header icons (profile avatar, notification bell) without explicit borderless ripple feedback (`?attr/selectableItemBackgroundBorderless`) or localized content descriptions fail basic screen-reader accessibility checks.
**Action:** Replace `textScaleX` with standard font scaling (`textSize="18sp"`, `textStyle="bold"`) and ensure interactive header images have explicit `contentDescription`, `clickable`, `focusable`, and borderless ripple feedback attributes.
