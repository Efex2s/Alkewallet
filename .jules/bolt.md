# Bolt's Performance Journal

## 2024-04-24 - Initial Audit
**Learning:** Found an artificial 3-second delay in Splash_Screen.java and a large unreferenced asset (circular.png, 824KB). Artificial delays negatively impact perceived performance, and unused assets bloat the APK.
**Action:** Reduced Splash Screen delay to 1s and deleted the unreferenced asset.
