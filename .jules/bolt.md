## 2024-05-11 - Artificial Splash Screen Delays
**Learning:** Hardcoded splash screen delays (e.g., 3000ms) are used in this codebase, which negatively impact perceived startup performance and user experience without providing functional value.
**Action:** Audit `Splash_Screen` activities and reduce delays to a minimum (e.g., 1000ms or less) while ensuring thread safety by using `Looper.getMainLooper()`.
