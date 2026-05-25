## 2025-05-24 - [Reduced Splash Screen Delay]
**Learning:** Artificial splash screen delays (e.g., 3000ms) are a common performance anti-pattern in this codebase that negatively impact perceived startup speed. Additionally, using the deprecated `new Handler()` constructor can lead to issues; `new Handler(Looper.getMainLooper())` is preferred for main-thread operations.
**Action:** Audit and reduce any artificial delays in activity transitions and prefer modern `Handler` constructors with explicit `Looper` references.
