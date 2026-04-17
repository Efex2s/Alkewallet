## 2024-04-17 - Navigation Menu Item Types
**Learning:** Using EditText for navigation menu items is a UX anti-pattern as it triggers the soft keyboard and suggests editability when the intent is navigation.
**Action:** Always use TextView or Button with visual feedback (ripple) and clear contentDescription for navigation items.
