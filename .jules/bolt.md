## 2026-06-04 - Reduced artificial splash delay
**Learning:** The application had a hardcoded 3000ms delay in the Splash_Screen activity, which negatively impacted the perceived startup time. Using a standard Handler without a Looper is also a deprecated pattern in modern Android development.
**Action:** Reduced the splash delay to 1000ms and updated the Handler to use Looper.getMainLooper() for better thread safety and compliance with modern Android standards.
