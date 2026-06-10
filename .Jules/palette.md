## 2024-05-24 - Semantic Navigation Items
**Learning:** Using 'EditText' for navigation/menu items in Android is a major UX anti-pattern. It incorrectly triggers the soft keyboard upon click and provides misleading hints to screen readers.
**Action:** Use 'TextView' for navigational elements. Apply 'android:background="?android:attr/selectableItemBackground"' and 'android:focusable="true"' to ensure proper touch feedback and keyboard accessibility.
