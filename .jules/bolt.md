## 2024-05-24 - Optimization of APK size by removing unused assets
**Learning:** Large unused assets (like 'circular.png', ~824KB) can significantly increase APK size without providing any value, impacting download and installation times.
**Action:** Regularly audit the 'res/drawable' directory for unused resources using tools like 'grep' or Android Studio's 'Analyze -> Inspect Code' to identify and remove redundant files.
