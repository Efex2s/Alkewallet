## 2025-05-15 - [Refactor Profile Menu Items]
**Learning:** Using EditText for navigation menu items is a UX anti-pattern. It erroneously triggers the soft keyboard and suggests editability when the intent is navigation. Always use TextView or Button with visual feedback (ripple) and clear contentDescription for such interactions.
**Action:** Replaced EditText with clickable, focusable TextViews with ripple feedback and accessibility labels in 'activity_mi_perfil.xml'.
