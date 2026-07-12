# Palette UX Journal

## 2024-05-15 - Form Consistency and Externalization
**Learning:** When modernizing form fields (e.g., adding a password toggle via TextInputLayout), it's crucial to apply the same styling to all fields in the form to maintain visual consistency. Additionally, always externalize new strings to `strings.xml` to avoid build breakages and support localization.
**Action:** Always audit the entire form when upgrading a single component and ensure all new UI text is added to resource files.
