## 2024-06-25 - Splash Screen Delay Optimization
**Learning:** Reducing artificial splash screen delays directly improves "time to interactive" and user satisfaction by removing unnecessary wait time. Additionally, using `Handler(Looper.getMainLooper())` is essential for modern Android compatibility as the default constructor is deprecated.
**Action:** Always check for artificial delays in startup activities and ensure UI handlers are explicitly tied to the main looper.
