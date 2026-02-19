## 2025-05-14 - [Visual Feedback for Clickable TextViews]
**Learning:** In Android, simply adding a background ripple to a `TextView` is not enough for accessibility. You must also explicitly set `android:clickable="true"` and `android:focusable="true"` to ensure the element is correctly identified by screen readers and handles focus states properly.
**Action:** Always include `clickable` and `focusable` attributes when adding visual interaction feedback to non-button UI elements.

## 2025-05-14 - [Autofill Hints and targetApi]
**Learning:** Adding `android:autofillHints` to an app with `minSdk < 26` triggers a lint warning. Using `tools:targetApi="o"` is the correct way to suppress this while still providing better UX for users on newer devices.
**Action:** Use `tools:targetApi="o"` when adding autofill hints to maintain build quality and UX compatibility.
