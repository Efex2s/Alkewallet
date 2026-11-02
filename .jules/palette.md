# Palette's UX Journal

## 2026-02-01 - Profile Navigation: Replacing Editable Inputs with Semantic Menu Items
**Learning:** Using `EditText` widgets for static list or profile navigation menus degrades accessibility and UX because screen readers announce them as editable fields, soft keyboards may be summoned unnecessarily, and placeholder `android:hint` text lacks the color contrast of primary text. Converting these items to focusable, clickable `TextView` elements with `?android:attr/selectableItemBackground`, explicit `android:text`, and balanced `android:drawablePadding` provides clear visual touch feedback and correct accessibility semantics.
**Action:** When inspecting navigation menus or list items in Android layouts, audit for improper `EditText` usage and replace them with interactive `TextView` or Button elements with appropriate accessibility traits and ripple feedback.
