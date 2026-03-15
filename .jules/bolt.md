## 2025-03-24 - Unused Asset and Manifest Cleanup
**Learning:** Large unused assets (like circular.png, ~824KB) and orphaned manifest entries (referencing non-existent classes) significantly bloat the APK and block lint-based verification pipelines. Identifying and removing these is a high-impact, low-risk optimization for build speed and binary efficiency.
**Action:** Always check for MissingClass lint errors and verify resource usage with grep before starting other optimizations to ensure a clean baseline.
