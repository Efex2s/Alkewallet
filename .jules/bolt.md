## 2026-01-31 - Splash Screen Delay & Handler Lifecycle Management
**Learning:** Hardcoded delays in splash activities directly degrade app startup metrics (Time to Interactive / TTI) and unhandled Handler runnables can cause context leaks if the user exits or rotates the screen before execution.
**Action:** Always minimize artificial splash delays (e.g. max 1000ms), pass `Looper.getMainLooper()` to `Handler` instances, and remove callbacks in `onDestroy()`.
