## 2026-03-24 - [Refactoring Navigation Menus]
**Learning:** Using EditText for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. Always use TextView or Button with visual feedback (ripple) and clear contentDescription.
**Action:** Before refactoring layout component types, always confirm the IDs are not referenced/cast in Java/Kotlin source code to avoid ClassCastExceptions.
