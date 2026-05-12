## 2024-05-13 - Artificial Splash Delay Anti-pattern
**Learning:** The application used a hardcoded 3000ms delay in `Splash_Screen.java` which serves no functional purpose and negatively impacts perceived startup performance. This is a common anti-pattern in this codebase.
**Action:** Audit and reduce artificial delays in splash screens or loading states across the app to improve time-to-interactive.
