## 2025-05-15 - Back navigation on Login screen
**Learning:** Adding a back button to screens that are part of a deep-linked or secondary flow (like Login from a landing page) significantly improves user control and freedom. When adding such top-aligned elements in a ConstraintLayout, it's crucial to adjust the constraints of existing top-aligned elements (like header text) to prevent overlap and maintain consistent vertical spacing.
**Action:** Always check for top-aligned elements when adding a header or back button, and re-constraint existing elements to be below the new component.
