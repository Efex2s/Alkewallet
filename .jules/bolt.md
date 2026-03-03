## 2026-03-03 - Splash Screen and Rendering Optimization
**Learning:** Using 'android:textScaleX' in layouts introduces extra computation in the Android text layout engine. For static screens like splash screens, ViewBinding adds unnecessary memory overhead and object allocation compared to direct 'setContentView'.
**Action:** Favor standard font sizing/weight over 'textScaleX' and avoid ViewBinding in simple, static activities to reduce TTI (Time to Interactive).
