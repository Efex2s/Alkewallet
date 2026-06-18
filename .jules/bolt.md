# Bolt Journal - Critical Learnings

## 2024-06-18 - Splash Screen Optimization and Handler Best Practices
**Learning:** A 3000ms splash screen delay is a significant UX bottleneck. Additionally, using `new Handler()` without an explicit Looper is deprecated and can lead to bugs; `new Handler(Looper.getMainLooper())` is the modern, safer, and more performant way to interact with the UI thread.
**Action:** Always prefer a shorter splash delay (e.g., 1000ms) and explicitly use the main looper for Handlers that update the UI.
