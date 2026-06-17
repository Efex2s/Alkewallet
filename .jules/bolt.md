## 2024-06-17 - [Android Handler Anti-pattern]
**Learning:** Using `new Handler()` without specifying a `Looper` is deprecated and can lead to bugs if not called from a thread with a looper. In this codebase, it was used for the splash screen transition, which should always happen on the main UI thread.
**Action:** Always use `new Handler(Looper.getMainLooper())` for UI-related delays or tasks to ensure safety and compatibility with modern Android SDKs.

## 2024-06-17 - [Perceived Performance: Splash Screen]
**Learning:** A 3-second delay for a splash screen that only performs a redirect is excessive and hurts perceived performance.
**Action:** Minimize splash screen delays to the minimum required for brand presence or necessary background initialization. 1 second is often sufficient for brand visibility without frustrating the user.
