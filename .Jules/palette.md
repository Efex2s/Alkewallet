## 2024-05-24 - Semantic TextViews for Navigation
**Learning:** Using `EditText` for menu navigation items is a poor UX pattern. It confusingly triggers the soft keyboard and implies editability when the user only intends to navigate. This also hampers accessibility as screen readers may announce them as input fields.
**Action:** Always use `TextView` or other non-editable views for navigation menus. Ensure they have `android:focusable="true"`, `android:clickable="true"`, and use `?android:attr/selectableItemBackground` for clear visual feedback.
