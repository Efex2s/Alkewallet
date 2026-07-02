# Palette's UX Journal

## 2025-05-14 - Standardizing Password Visibility Toggles
**Learning:** Using `TextInputLayout` with `app:endIconMode="password_toggle"` is the standard Material Design approach for password fields. It significantly improves UX by allowing users to verify their input, reducing login failures. When refactoring from `EditText` to `TextInputLayout`, it's crucial to update constraints of adjacent views and preserve the input field's ID for ViewBinding compatibility.
**Action:** Always wrap password `EditText` fields in `TextInputLayout` with `password_toggle` enabled across the app's entry and registration forms.
