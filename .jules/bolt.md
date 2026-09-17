# Bolt's Performance Journal

## 2026-03-30 - Splash Screen Startup Delay and Unused Asset Removal
**Learning:** Hardcoded splash delays artificially degrade Time to Interactive (TTI), and unused heavy image assets inflate APK size and memory overhead. Explicit Handler thread binding prevents deprecation and memory leaks.
**Action:** Minimize splash delay, clear Handler callbacks on destroy, and delete unreferenced drawable resources.
