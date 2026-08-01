## 2026-01-31 - ImageButton Content Description in Ingresar Dinero Screen
**Learning:** Adding semantic `contentDescription` to image buttons (like the profile avatar `imageButton5` in the deposit flow) ensures that screen readers can convey the correct visual context to visually impaired users, enhancing overall form accessibility.
**Action:** Always verify that interactive or focusable image elements (e.g. `ImageButton` or `ImageView` with click action) have distinct, meaningful `contentDescription` attributes instead of generic ones or leaving them empty.
