## 2024-05-23 - Authentication Flow Accessibility and Feedback
**Learning:** The 'read_file' tool output is truncated at 1000 characters. To inspect large layout XML files (>1KB), use bash commands like 'grep -C' or 'sed' to verify specific element attributes and IDs. Adding 'autofillHints' significantly improves form UX but requires 'tools:targetApi="o"' for minSdk < 26.
**Action:** Always use 'grep' or 'sed' for verifying specific parts of large XML files and ensure 'autofillHints' are accompanied by 'tools:targetApi' when necessary.
