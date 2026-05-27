# Bolt's Performance Journal

This journal documents critical performance learnings and anti-patterns discovered in the codebase.


## 2024-05-27 - Optimized Splash Screen Delay
**Learning:** Artificial delays in splash screens (e.g., 3000ms) negatively impact perceived performance and user experience without providing technical value.
**Action:** Audit splash screens and reduce artificial delays to the minimum required for brand presence or background initialization (typically 1000ms or less).
