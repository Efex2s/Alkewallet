## 2025-05-13 - Splash Screen Optimization and Unused Assets
**Learning:** For static screens like splash screens, ViewBinding adds unnecessary overhead (object allocation and class generation). Additionally, found a large unused asset (circular.png) which increases APK size without value.
**Action:** Always prefer direct inflation (setContentView) for static activities and regularly audit drawable folders for unused high-resolution assets.
