# Bolt's Performance Journal

## 2024-04-27 - Initial Performance Audit
**Learning:** Artificial splash delays (3000ms) negatively impact perceived startup performance. Unreferenced large assets like 'circular.png' (824KB) bloat the APK size without providing value.
**Action:** Always check for fixed delays in Splash activities and use lint or grep to identify orphaned large resources.
