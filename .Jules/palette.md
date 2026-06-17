# Palette's Journal - Critical UX/Accessibility Learnings

## 2024-05-22 - Material 3 Password Visibility
**Learning:** Using Material `TextInputLayout` with `app:endIconMode="password_toggle"` provides a standard, accessible way for users to verify their input, which is especially important on mobile where typing errors are common.
**Action:** Always wrap password `EditText` in `TextInputLayout` when Material Components are available.
