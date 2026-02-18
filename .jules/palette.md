## 2024-05-23 - [Autofill & Accessibility]
**Learning:** Adding `android:autofillHints` with `tools:targetApi="o"` significantly improves the login/signup experience by enabling password manager integration on Android without breaking compatibility. Marking decorative background vectors with `android:importantForAccessibility="no"` prevents screen reader clutter.
**Action:** Always check for missing autofill hints in forms and decorative images in new or modified layouts.
