## 2026-06-06 - Handler Thread Safety Anti-pattern
**Learning:** Using 'new Handler()' without an explicit Looper is deprecated and can lead to bugs if not called from a thread with a Looper. In Android, UI tasks should explicitly use 'Looper.getMainLooper()'.
**Action:** Always use 'new Handler(Looper.getMainLooper())' for UI-related delays or tasks to ensure thread safety and modern SDK compatibility.
