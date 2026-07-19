# Palette's UX and Accessibility Journal

## 2024-07-19 - EditText as Navigation Item Anti-Pattern
**Learning:** Using `EditText` for navigation list items on Android is a severe UX anti-pattern because clicking the item immediately triggers the soft keyboard to pop up, frustrating users who expect page navigation. Replacing them with focusable `TextView` components with touch/ripple feedback provides a standard, accessible menu experience.
**Action:** Always use clickable, focusable `TextView` or standard Material Buttons with proper vertical centering and `selectableItemBackground` for text-based list menus and navigation.
