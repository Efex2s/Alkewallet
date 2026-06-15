## 2025-05-14 - [Splash Screen Latency]
**Learning:** Hardcoded splash screen delays (e.g., 3000ms) significantly impact Time to Interactive (TTI) and perceived performance without adding functional value. Additionally, using 'new Handler()' without an explicit Looper is a deprecated anti-pattern that can lead to threading issues in modern Android.
**Action:** Always prefer 'new Handler(Looper.getMainLooper())' for UI-related delays and keep splash screen durations to the minimum required for branding or initialization (typically <= 1000ms).
