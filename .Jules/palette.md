## 2024-05-30 - Standardizing Password Visibility Toggles
**Learning:** Using raw `EditText` with `inputType="textPassword"` without a visibility toggle forces users to re-type long passwords if they make a mistake, leading to frustration. Material 3's `TextInputLayout` with `app:endIconMode="password_toggle"` provides a standardized, accessible way to let users verify their input without compromising security.
**Action:** Always wrap password input fields in `TextInputLayout` and enable the `password_toggle` icon mode to align with modern mobile UX expectations.
