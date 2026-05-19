## 2024-05-19 - Artificial Splash Screen Delay
**Learning:** The application uses an artificial 3000ms delay in `Splash_Screen.java`, which unnecessarily slows down the app's perceived startup time.
**Action:** Audit splash screens for hardcoded delays and reduce them to the minimum necessary for branding or initialization (typically <= 1000ms).
