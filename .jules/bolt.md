## 2024-05-23 - Artificial Splash Delay and Unreferenced Assets
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance, and unreferenced large assets like `circular.png` (824KB) bloat the APK size without providing value.
**Action:** Always check for hardcoded delays in Splash activities and use lint/grep to identify and remove unused large resources to improve startup speed and reduce footprint.
