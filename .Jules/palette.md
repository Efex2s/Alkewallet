# Palette UX Journal

## 2024-08-06 - EditText as Navigation Item
**Learning:** Using `EditText` fields for navigation list items (e.g., settings, profile menus) creates a confusing user experience by opening the soft keyboard and pretending to be editable inputs instead of initiating navigation. Additionally, layout elements representing buttons or actions should have proper background ripple selectors (`?android:attr/selectableItemBackground`) and accessibility content descriptions to support screen readers.
**Action:** Always implement navigation links or menu lists as standard `TextView` components with proper gravities, click/focus attributes, and background selectors, rather than raw text input elements.
