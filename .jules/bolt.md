## 2024-05-15 - Optimizing APK Size and Perceived Startup Speed
**Learning:** Legacy Android projects often accumulate unused large assets (like 'circular.png' at ~824KB) and boilerplate activities ('MainActivity') that bloat the APK. Additionally, default splash screen delays (3000ms) can be safely reduced to improve perceived performance without impacting branding.
**Action:** Always prioritize removing unused binary assets identified by lint and auditing Splash Screen timing as quick wins for performance and efficiency.
