## 2024-05-15 - EditText as Navigation Item Anti-Pattern
**Learning:** In profile and menu layouts, implementing menu items as `EditText` instead of `TextView` or standard buttons is a severe accessibility and usability anti-pattern. Clicking or focusing these items triggers the soft keyboard, causing unexpected behavior and disrupting screen reader flow.
**Action:** Always use `TextView` with `android:background="?attr/selectableItemBackground"`, `android:focusable="true"`, and `android:clickable="true"` for static navigation menu options.

## 2024-05-16 - Stretched and Distorted Typography
**Learning:** Using properties like `android:textScaleX="2"` to alter text width distorts font rasterization, drastically reducing readability and creating a visually jarring experience, especially for users with visual impairments.
**Action:** Use standard text sizes, font families, and weights (`android:textStyle="bold"`) to emphasize numerical figures instead of scaling axes.
