## 2026-04-14 - Splash Delay and Unused Assets
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance and user experience. Additionally, unreferenced binary assets (like 'circular.png', 824KB) bloat the APK size without providing value.
**Action:** Always audit Splash screen handlers for excessive delays and perform project-wide grep before removing assets to ensure they are truly unreferenced.
