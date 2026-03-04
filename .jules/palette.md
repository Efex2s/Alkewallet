## 2025-05-14 - Home Page UX and Accessibility Polish
**Learning:** Hardcoded strings and distorted text (textScaleX) significantly hinder accessibility and visual quality in Android layouts. Providing interactive feedback via circular ripples for icon-only buttons improves perceived responsiveness.
**Action:** Always check for textScaleX and hardcoded strings in layouts; ensure all ImageViews used as buttons have contentDescriptions and appropriate ripple backgrounds.
