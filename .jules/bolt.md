## 2024-05-02 - Performance Bottlenecks in Startup and APK Size
**Learning:** The application had an artificial 3000ms delay in the Splash Screen, which significantly impacted perceived startup time. Additionally, the presence of a large unreferenced 824KB asset (`circular.png`) and a broken manifest entry for a missing Activity (`SignupPage`) indicates a need for regular resource audit.
**Action:** Always check for fixed delays in Splash screens and run lint to identify unused large assets and missing class references that bloat the APK and cause build warnings.
