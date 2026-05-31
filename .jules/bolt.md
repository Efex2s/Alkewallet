## 2025-01-24 - Reducing Artificial Splash Screen Delays
**Learning:** Artificial delays in splash screens (e.g., 3000ms) negatively impact the perceived performance and user experience by making the app feel slow to start. Auditing these delays and reducing them to a minimum (e.g., 1000ms) significantly improves the app's responsiveness.
**Action:** Always check `Splash_Screen.java` or similar entry points for hardcoded delays and suggest reductions if they exceed 1000ms without a technical requirement.
