# Palette's UX Journal

## 2024-07-21 - [EditText as Navigation Item]
**Learning:** Using `EditText` for navigation buttons is a major anti-pattern. Clicking them triggers the soft keyboard instead of clean navigation, leading to user confusion and frustration.
**Action:** Use `TextView` or standard buttons with ripple backgrounds (`selectableItemBackground`) for navigational lists.

## 2024-07-21 - [Stretched and Distorted Typography]
**Learning:** Using `android:textScaleX="2"` to make text wider distorts typography, rendering it pixelated and difficult to read for low-vision users.
**Action:** Use proper typography standards (e.g., specific `android:textSize` and `android:textStyle="bold"`) to scale text naturally and cleanly without horizontal stretching.
