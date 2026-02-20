## 2024-05-23 - Splash Screen Optimization
**Learning:** For static Activities with no programmatic view interaction, avoiding ViewBinding and using `setContentView(R.layout.activity_name)` directly reduces object allocation overhead and improves inflation time. Additionally, reducing unnecessary delays in splash screens directly improves the Time-to-Interactive (TTI) for the user.
**Action:** Always evaluate if ViewBinding is strictly necessary for simple/static Activities and prioritize reducing artificial delays to enhance perceived performance.
