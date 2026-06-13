## 2024-06-13 - [Add Password Visibility Toggle]
**Learning:** When refactoring existing `EditText` to `TextInputLayout` with `app:endIconMode="password_toggle"`, it's crucial to update constraints of neighboring views to point to the new container ID to avoid UI overlapping or broken layouts in `ConstraintLayout`.
**Action:** Always check `app:layout_constraintTop_toBottomOf` and similar attributes on adjacent views when introducing new container layouts.
