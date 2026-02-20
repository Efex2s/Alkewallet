## 2025-05-14 - [Accessibility & Feedback in Forms]
**Learning:** In this Android app, clickable TextViews used as links (e.g., "Forgot Password", "Sign Up") lacked visual feedback and accessibility properties. Decorative background images also added noise for screen readers.
**Action:** Always add `android:clickable="true"`, `android:focusable="true"`, and `android:background="?attr/selectableItemBackground"` to clickable TextViews. Mark decorative images with `android:importantForAccessibility="no"`. Use `android:autofillHints` with `tools:targetApi="o"` to improve form usability.
