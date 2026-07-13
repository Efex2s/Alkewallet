## 2024-05-24 - [Unused Assets and Startup Delays]
**Learning:** Found a large unreferenced asset (`circular.png`, 824KB) and a hardcoded 3-second delay in the Splash Screen. These are common bottlenecks in mobile apps that directly impact APK size and Time to Interactive (TTI).
**Action:** Always check `AndroidManifest.xml` for the entry point and audit the startup Activity for hardcoded delays. Use `grep` to verify if large assets are actually referenced before keeping them.
