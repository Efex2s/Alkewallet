# Palette's UX & Accessibility Journal

## 2024-11-20 - Avoid Using EditText for Navigation Menu Items
**Learning:** Using `EditText` as static navigation options (e.g., in a settings or profile menu) causes the soft keyboard to pop up unnecessarily, resulting in a frustrating and confusing user experience. Menu items should use `TextView` with custom drawables.
**Action:** Always employ `TextView` components for navigation menus. Ensure they have `android:focusable="true"`, `android:clickable="true"`, and appropriate touch feedback like `selectableItemBackground`.

## 2024-11-20 - Distorted Typography with textScaleX
**Learning:** Using `android:textScaleX` with values greater than 1 (like `textScaleX="2"`) to stretch text results in distorted and highly unprofessional-looking typography that degrades readability and accessibility.
**Action:** Use modern typography attributes such as `android:textSize` and `android:textStyle="bold"` combined with standard font families to scale text cleanly.

## 2024-11-20 - Circular Ripple Touch Feedback
**Learning:** For irregular, custom circular buttons (like profile avatars or bell icons), the standard rectangular ripple constrained to the bounding box looks jarring.
**Action:** Use `android:background="?attr/selectableItemBackgroundBorderless"` to ensure a natural, circular ripple effect.
