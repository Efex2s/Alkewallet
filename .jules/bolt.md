## 2024-06-20 - Splash Screen Optimization
**Learning:** Using 'new Handler()' without a specified Looper is a performance and safety anti-pattern. Always prefer 'new Handler(Looper.getMainLooper())' for UI tasks. Additionally, long splash screen delays (e.g., 3000ms) negatively impact perceived app performance.
**Action:** Always specify 'Looper.getMainLooper()' when creating Handlers for UI thread work and keep splash delays minimal (<= 1000ms).
