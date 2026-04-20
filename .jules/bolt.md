# Bolt Performance Journal

This journal tracks critical performance insights and learnings for the project.

## 2026-04-14 - Splash Screen and APK Size Optimization
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance. Removing large unreferenced assets (824KB circular.png) provides risk-free APK size reduction.
**Action:** Always check for redundant splash delays and unused large drawables as quick performance wins.
