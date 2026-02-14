## 2024-05-24 - [Artificial Startup Delay]
**Learning:** Found an artificial 3-second delay in the splash screen which significantly hinders the user's "Time to Interactive" (TTI).
**Action:** Reduce artificial delays in splash screens to the minimum necessary for branding/initialization (usually 1s or less).

## 2024-05-24 - [Unused Large Assets]
**Learning:** Found a large unused image (`circular.png`, 824KB) that accounts for ~68% of the drawable resources.
**Action:** Always audit resources to ensure no unused large files are bundled in the APK.

## 2024-05-24 - [Deprecated Handler Constructor]
**Learning:** Using `new Handler()` without a Looper is deprecated and can lead to bugs if not called from a thread with a looper.
**Action:** Always use `new Handler(Looper.getMainLooper())` when posting to the UI thread.
