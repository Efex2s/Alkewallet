## 2024-07-21 - EditText as Navigation Item
**Learning:** Using `EditText` as a static navigation menu item leads to terrible UX because focusing/clicking it pops up the soft keyboard unnecessarily and fails standard accessibility guidelines for navigation components.
**Action:** Always use `TextView` with `selectableItemBackground` and appropriate interactive flags (like `focusable="true"`, `clickable="true"`) for static menu options.

## 2024-07-21 - Stretched and Distorted Typography
**Learning:** Overusing `textScaleX` (e.g., `textScaleX="2"`) distorts fonts severely, harming readability and layout appearance.
**Action:** Use proper standard font sizes (`textSize`) and text weights (`textStyle="bold"`) to emphasize text instead of scaling its width.

## 2024-07-22 - Password Fields Usability and Keyboard Obscurity in Forms
**Learning:** Raw `EditText` views used for passwords lack built-in visibility toggle options, making it hard for users on mobile devices to check their input. Also, long forms can get cut off or become completely unreachable under the soft keyboard when they are not enclosed in a `ScrollView`.
**Action:** Wrap login/registration input forms in modern Material Component `TextInputLayout` wrappers with `app:endIconMode="password_toggle"`, and embed long vertical layouts inside a `ScrollView` with `fillViewport="true"`.
