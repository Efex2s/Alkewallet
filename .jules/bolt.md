## 2024-05-24 - [Artificial Splash Delay Bottleneck]
**Learning:** The application had an unnecessary 3-second artificial delay on startup, significantly impacting TTI. Reducing this to 1 second provides a measurable 2000ms performance gain.
**Action:** When encountering custom Splash activities, prioritize reducing artificial delays and ensuring lifecycle-safe Handler usage.
