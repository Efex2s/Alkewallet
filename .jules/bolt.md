# Bolt Performance Journal

## 2025-11-05 - Dead asset inflation of APK bundle size
**Learning:** In Android apps, unreferenced drawable assets packaged under `res/drawable` are included directly in the final APK by default, inflating app download size, install time, and storage footprint without providing any functional benefit. In this case, `circular.png` alone was 843KB of uncompressed dead weight.
**Action:** Always check Android Lint's `UnusedResources` output and inspect APK contents (`unzip -l`) for large unreferenced assets before enabling or tuning resource shrinking rules.
