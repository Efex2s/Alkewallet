## 2024-07-10 - Reduced Splash Screen Delay
**Learning:** Hardcoded UI delays (e.g., in Splash_Screen.java) are primary bottlenecks for Time to Interactive (TTI) and perceived performance. High delays (3000ms) negatively impact user engagement without providing functional value.
**Action:** Always audit for hardcoded delays in startup sequences and optimize them to the minimum necessary for branding or data pre-loading.
