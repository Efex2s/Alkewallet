## 2025-05-14 - Password Visibility Toggle and Accessibility
**Learning:** Using `TextInputLayout` with `app:endIconMode="password_toggle"` is a low-effort, high-impact UX improvement for Android forms. Additionally, marking decorative background images with `android:importantForAccessibility="no"` reduces screen reader noise and improves the overall accessibility experience.
**Action:** Always wrap password `EditText` fields in `TextInputLayout` and ensure decorative assets are explicitly hidden from accessibility services.
