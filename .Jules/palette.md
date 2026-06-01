## 2026-06-01 - Materializing Login Fields
**Learning:** Refactoring raw `EditText` to `TextInputLayout` with `app:endIconMode="password_toggle"` significantly improves mobile usability and accessibility. Maintaining original `EditText` IDs for the inner `TextInputEditText` prevents breaking ViewBinding/Java references.
**Action:** Prioritize `TextInputLayout` for all form fields; ensure layout constraints for dependent views are updated to point to the new container ID.
