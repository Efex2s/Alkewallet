## 2026-04-14 - Replace EditText with TextView for Navigation
**Learning:** Using EditText for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. It confuses users and creates a sub-optimal experience for screen readers.
**Action:** Always use TextView or Button for menu/list items. Ensure they have `android:background="?attr/selectableItemBackground"`, `android:clickable="true"`, `android:focusable="true"`, and a clear `android:contentDescription`.
