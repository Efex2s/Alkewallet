## 2024-05-24 - Semantic Color Coding and Icon Accessibility

**Learning:** In financial applications, using semantic colors (green for income, red for expenses) is a powerful micro-UX win that improves scannability more effectively than font distortions like `textScaleX`. Additionally, providing `contentDescription` for icon-only buttons is a critical accessibility requirement that is often overlooked in early-stage Android layouts.

**Action:** Always check for font distortions (like `textScaleX`) and replace them with semantic color or size improvements. Ensure every interactive `ImageView` has a `contentDescription`.
