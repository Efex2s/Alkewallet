## 2026-04-14 - Splash Screen Delay and Unused Assets
**Learning:** Artificial delays in Splash Screens (e.g., 3000ms) negatively impact perceived performance. Large unreferenced assets (like circular.png, 824KB) bloat the APK size without providing value.
**Action:** Reduce Splash Screen delay to a minimum (e.g., 1000ms) and perform a thorough search before deleting unreferenced assets to safely reduce APK size.
