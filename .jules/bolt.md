## 2025-05-14 - Splash Screen Optimization & Memory Safety
**Learning:** For static activities like Splash Screens that have no programmatic UI interaction, using direct layout inflation (`setContentView(R.layout.activity_name)`) instead of ViewBinding reduces object allocation and initialization overhead. Additionally, reducing artificial delays directly improves perceived performance (TTI).
**Action:** Always check if ViewBinding is truly necessary in small/static activities and ensure Handlers are lifecycle-safe to prevent memory leaks.
