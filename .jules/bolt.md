# Bolt Performance Journal

## 2024-04-25 - Initial Performance Audit
**Learning:** Artificial delays in splash screens (3000ms) negatively impact the perceived performance of the application. Additionally, unreferenced large assets like `circular.png` (824KB) contribute to unnecessary APK bloat.
**Action:** Reduce splash delay to a more reasonable 1000ms and remove unreferenced large assets to optimize both startup speed and installation size.
