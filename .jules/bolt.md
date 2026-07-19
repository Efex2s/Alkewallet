## 2026-03-31 - [Optimize Splash Screen Delay to Improve TTI]
**Learning:** Hardcoded startup delays in Splash Screen activities (e.g., Handlers running for 3000ms) introduce unnecessary latency, hurting Time to Interactive (TTI) and overall user experience.
**Action:** Always audit for startup handlers and optimize delays to the minimum functional duration (e.g., 1000ms) and ensure they use MainLooper for robust thread execution on the UI thread.
