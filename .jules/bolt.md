## 2025-05-14 - Splash Screen Optimization
**Learning:** The application used a hardcoded 3000ms delay in the splash screen, which is a significant bottleneck for perceived performance and Time to Interactive (TTI). Additionally, using the deprecated 'new Handler()' constructor without an explicit Looper is a thread-safety anti-pattern in this codebase.
**Action:** Always prefer 'new Handler(Looper.getMainLooper())' for UI-related delays and keep splash screens under 1000ms to maintain a 'speed is a feature' UX philosophy.
