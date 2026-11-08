## 2026-03-31 - Typography Distortions and Icon Feedback

**Learning:** Using `android:textScaleX="2"` to achieve visual emphasis creates stretched, unnatural text artifacts that degrade legibility and look unpolished across different Android screen densities. Semantic text styling (`android:textSize="18sp"`, `android:textStyle="bold"`) coupled with meaningful color coding (`@color/verdebutton` for income, `@color/red_expense` for expenses) provides much clearer hierarchy. Furthermore, interactive icon controls such as profile avatars and notification bells must always pair accessible labels (`contentDescription`) with borderless ripple backgrounds (`?attr/selectableItemBackgroundBorderless`) to convey both state and responsiveness to all users.

**Action:** Replace `textScaleX` tricks with proper font sizing and semantic text colors, and ensure header icons have borderless ripple feedback and accessibility descriptions.
