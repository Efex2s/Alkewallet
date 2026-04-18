## 2026-04-18 - [UX] Navigation menu items as EditText
**Learning:** Using EditText for navigation menu items is a UX anti-pattern that erroneously triggers the soft keyboard and suggests editability. Always use TextView or Button with visual feedback (ripple) and clear contentDescription.
**Action:** Use TextView with clickable="true", focusable="true", and selectableItemBackground for navigation/action items that are not meant to be text inputs.
