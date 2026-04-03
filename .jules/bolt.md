## 2025-05-15 - [Splash screen delay and unused assets]
**Learning:** Reducing splash screen delay from 3000ms to 1000ms significantly improves perceived performance. Also, removing large unused assets (like circular.png, 824KB) reduces APK size and memory footprint. Removing non-existent activity declarations in manifest prevents build-blocking lint errors.
**Action:** Always check for redundant splash delays and unused large assets during initial profiling. Use lint to find missing classes declared in manifest.
