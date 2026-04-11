## 2025-05-15 - [Splash Delay Reduction & Asset Cleanup]
**Learning:** Hardcoded splash screen delays (3s) and unused large assets (824KB) significantly impact perceived and actual app performance. Enabling R8 shrinking is essential for production efficiency.
**Action:** Always check for redundant assets and excessive delays in startup activities. Ensure `isMinifyEnabled` is true for release builds.
