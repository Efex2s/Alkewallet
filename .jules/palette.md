## 2024-05-23 - Standardizing Menu Navigation and Accessibility

**Learning:** Using `EditText` for navigation menu items is a major UX anti-pattern as it triggers the soft keyboard and implies editability where only navigation is intended. Standardizing these to `TextView` with `selectableItemBackground` provides a much cleaner, more intuitive interaction. Additionally, hardcoding spaces in string resources for layout padding is fragile; `android:drawablePadding` should be used instead for consistent icon-to-text spacing.

**Action:** Always check if interactive text elements are intended for input or navigation. Use `TextView` for the latter and prefer layout attributes over string-based spacing. Ensure decorative background images are explicitly hidden from screen readers using `android:importantForAccessibility="no"`.
