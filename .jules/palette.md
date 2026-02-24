## 2024-05-15 - Enhancing Form Usability and Feedback

**Learning:** Adding `autofillHints` and visual feedback (ripple + focusability) to pseudo-links (TextViews) significantly improves the professional feel and accessibility of Android forms. Using `tools:targetApi="o"` allows for safe use of modern attributes on older SDKs.

**Action:** Always check for `autofillHints` in login/signup forms and ensure all clickable text elements have proper focusability and interaction feedback.
