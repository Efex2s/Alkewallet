## 2026-03-30 - [Splash Screen Speedup & Asset Cleanup]
**Learning:** Found an unreferenced large asset 'circular.png' (824KB) and an unnecessary 3-second splash screen delay. Removing such assets directly impacts APK size and startup performance.
**Action:** Always check for unreferenced drawables and audit splash screen durations for a better user experience.

## 2026-03-30 - [MissingClass Lint Fix]
**Learning:** Removing unreferenced files or fixing manifest declarations can resolve build-blocking lint errors. 'SignupPage' was declared but missing, and 'activity_signup_page.xml' was redundant.
**Action:** Run './gradlew lintDebug' early to catch broken references and keep the codebase clean.
