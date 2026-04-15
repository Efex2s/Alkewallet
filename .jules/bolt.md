## 2026-04-14 - Artificial Delay in Splash Screen
**Learning:** Artificial delays (e.g., 3000ms) in Splash Screens negatively impact perceived performance without providing technical value.
**Action:** Reduce artificial delays to a minimum (e.g., 1000ms) or move to the Android 12 Splash Screen API.

## 2026-04-14 - Unused Large Assets
**Learning:** Large unreferenced assets (e.g., circular.png at 824KB) increase APK size and consume disk space on user devices without benefit.
**Action:** Regularly audit resources and remove unreferenced assets to keep the application lean.
