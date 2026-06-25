## 2024-05-15 - Modernizing Form Inputs
**Learning:** Standardizing password visibility toggles using `TextInputLayout` and providing interactive feedback on TextView links significantly improves accessibility and user satisfaction without requiring heavy redesigns.
**Action:** Always prefer `TextInputLayout` for form inputs to get floating labels and visibility toggles for free. Ensure interactive TextViews have `selectableItemBackground` and are marked as `clickable`/`focusable`.
