# Bolt Performance Journal

## 2024-04-26 - Initial Performance Audit
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance. Unreferenced large assets like 'circular.png' (824KB) bloat the APK size.
**Action:** Regular checks for splash delay values and unreferenced assets via lint or grep.
