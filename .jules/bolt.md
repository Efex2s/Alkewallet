## 2024-05-24 - Artificial Startup Delays
**Learning:** Artificial splash screen delays (e.g., 3000ms) are a common performance anti-pattern in this codebase that negatively impacts user experience.
**Action:** Audit splash screens and reduce or remove hardcoded delays, ensuring critical background tasks (if any) are properly managed or migrated to early-init phases.
