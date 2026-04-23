# Bolt Journal - Performance Learnings

## 2024-04-23 - Initial Performance Audit
**Learning:** Artificial splash delays (3000ms) negatively impact perceived performance. Large unreferenced assets like `circular.png` (824KB) bloat the APK size unnecessarily.
**Action:** Always check for hardcoded delays in Splash screens and hunt for unused large assets using `grep` or lint tools.
