## 2025-05-15 - Optimizing Splash Screen and APK size

**Learning:** Removing unused large assets (e.g., `circular.png` ~824KB) is one of the most effective ways to reduce APK size and improve installation efficiency. For simple, static Activities like Splash Screens, avoiding ViewBinding reduces object allocation and layout inflation overhead. Additionally, using `new Handler(Looper.getMainLooper())` is the correct way to schedule delayed tasks on the UI thread, avoiding deprecated constructors and potential runtime issues. Finally, non-existent class references in `AndroidManifest.xml` (like `.SignupPage`) trigger `MissingClass` lint errors that can block the build process.

**Action:** Always check for unused large assets in `res/drawable` and `res/mipmap`. Prefer `setContentView(R.layout.activity_name)` over ViewBinding for activities with no programmatic view interaction. Ensure all activities declared in the manifest actually exist in the source code to avoid lint failures.
