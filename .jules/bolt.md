## 2024-05-23 - Optimize startup performance
**Learning:** Artificial splash screen delays (e.g., 3000ms) negatively impact perceived performance and user retention. Reducing these delays provides an immediate improvement in UX.
**Action:** Audit and reduce artificial delays in splash screens across the codebase. Ensure Handlers use Looper.getMainLooper() for thread safety and to avoid deprecation.
