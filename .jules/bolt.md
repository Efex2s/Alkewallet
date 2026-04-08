## 2025-05-15 - [Initial performance cleanup]
**Learning:** Large unused assets (824KB) and excessive splash screen delays (3000ms) significantly impact perceived performance and APK size. Identifying and resolving 'MissingClass' lint errors during build can prevent future crashes and ensure a cleaner codebase.
**Action:** Always check `lintDebug` for missing class references and use `grep` to identify unreferenced large assets before submission.
