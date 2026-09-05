## 2025-03-05 - Unreferenced Heavy Assets Optimization
**Learning:** Unused high-resolution image resources in the `res/drawable` folder (such as `circular.png` at ~824KB) significantly inflate the final APK bundle size without contributing to UI rendering.
**Action:** Perform static resource audits using `grep` or linting toolings to locate and remove dead image assets, directly decreasing APK footprint and download latency.
