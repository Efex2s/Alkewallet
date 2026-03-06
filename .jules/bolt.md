# Bolt Performance Journal

## 2025-05-15 - Splash Screen Optimization
**Learning:** For static screens like Splash Screens, ViewBinding introduces unnecessary overhead (object allocation and inflation time). Using direct layout inflation is more efficient. Also, using the default Handler constructor is deprecated and can lead to bugs if not explicitly tied to the main looper.
**Action:** Use `setContentView(R.layout.activity_name)` for static views and always use `new Handler(Looper.getMainLooper())`.
