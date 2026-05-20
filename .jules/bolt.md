## 2024-05-20 - Artificial Splash Delay Anti-pattern
**Learning:** Artificial delays in Splash Screens (e.g., 3000ms) negatively impact perceived performance and user retention without providing technical value.
**Action:** Always audit Splash Screen activities and reduce artificial delays to the minimum required for branding (typically <= 1000ms) or ideally replace with the Android SplashScreen API.
