## 2025-05-15 - Initial Performance Audit
**Learning:** Found several performance anti-patterns including hardcoded layout widths, nested LinearLayouts, and inefficient text scaling (textScaleX) in `activity_home_page2.xml`. Also identified a long 3s splash screen delay.
**Action:** Prioritize flattening layouts and removing inefficient rendering attributes like `textScaleX`.
