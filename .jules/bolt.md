## 2024-05-22 - Optimized app startup and reduced APK size
**Learning:** Artificial splash delays and unreferenced large assets are standard performance bottlenecks that can be surgically improved with low risk.
**Action:** Always check `Splash_Screen` for hardcoded delays and use lint or grep to find unreferenced large drawables to minimize APK size.
