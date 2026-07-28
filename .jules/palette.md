# Palette UX Journal

## 2026-07-28 - [Accessible Navigation Back Button]
**Learning:** When using drawables (like back arrows) as interactive trigger elements in Android, using a raw `<ImageView>` is an anti-pattern because it lacks correct accessibility button roles/traits and default click/focus states. Refactoring to an `<ImageButton>` with `android:background="?attr/selectableItemBackgroundBorderless"` provides semantic accessibility and polished visual ripple feedback on tap/focus.
**Action:** Always employ `<ImageButton>` or custom accessible views for icon-only action elements, and supply descriptive localized `contentDescription` resources.
