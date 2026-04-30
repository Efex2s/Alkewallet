## 2024-04-30 - Startup Delay and APK Bloat
**Learning:** Hardcoded splash delays and unreferenced large assets are common "quick wins" in Android projects that significantly impact user perception and installation size.
**Action:** Always check the Splash Activity for `postDelayed` and run lint or grep to identify unused resources over 100KB.

**Impact Summary:**
- **Perceived Startup Speed:** Reduced mandatory splash delay from 3000ms to 1000ms (-2000ms).
- **APK Size Reduction:** Deleted ~824KB of unused assets (`circular.png`) and removed orphaned layout files and manifest declarations.
