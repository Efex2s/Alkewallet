## 2024-03-06 - [Splash delay optimization]
**Learning:** Hardcoded splash delays should be minimized. Handlers need main looper explicitly to avoid memory leaks or runtime issues.
**Action:** Use short delay and clean up callbacks.
