# Bolt's Performance Journal

## 2025-05-10 - Artificial Splash Screen Delays
**Learning:** The codebase used a 3000ms artificial delay in `Splash_Screen.java`, which negatively impacts perceived startup performance without providing any functional benefit.
**Action:** Audit splash screens for hardcoded delays and reduce them to the minimum necessary for branding (e.g., 1000ms) or remove them entirely in favor of immediate navigation to the first interactive screen.
