## 2025-01-24 - Splash Screen Optimization and Asset Cleanup
**Learning:** Artificial splash delays (e.g., 3000ms) are common performance anti-patterns that degrade perceived startup speed. Large, unreferenced assets significantly inflate bundle size without benefit.
**Action:** Always audit Splash Screen delays and use `grep` to identify unreferenced assets for deletion. Updated Splash_Screen.java to use `Looper.getMainLooper()` to follow modern Android threading best practices and reduced delay to 1000ms. Removed `circular.png` (~824KB) to reduce APK size.
