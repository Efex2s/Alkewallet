## 2025-05-22 - Optimizing Application Startup
**Learning:** Found that static activities like Splash Screens often use ViewBinding and long delays (3s), which increase memory overhead and perceived latency without providing functional benefits.
**Action:** Use direct layout inflation (`setContentView`) and reduce delays to ~2000ms for static branding screens to improve Time To Interactive (TTI) and reduce object allocation.

## 2025-05-22 - APK Bloat from Unused Assets
**Learning:** Significant APK size reduction (~45% of resources) was achieved by identifying and removing a single unused high-resolution PNG (`circular.png`).
**Action:** Always check for large binary assets that are not referenced in the code or layouts when optimizing for efficiency.
