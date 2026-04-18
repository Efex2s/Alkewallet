## 2026-04-14 - Splash Delay and Unused Asset Removal
**Learning:** Artificial splash screen delays (3000ms) negatively impact perceived performance without technical necessity. Removing large unreferenced assets (824KB `circular.png`) provides risk-free reduction in APK size.
**Action:** Always check Splash Screen timers and audit `res/drawable` for large unused files.
