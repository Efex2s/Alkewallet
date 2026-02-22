package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash screen activity optimized for performance.
 * - Uses direct layout inflation instead of ViewBinding to reduce memory overhead.
 * - Implements lifecycle-safe Handler management to prevent memory leaks.
 * - Reduced delay to 2000ms for faster perceived startup.
 */
public class Splash_Screen extends AppCompatActivity {

    private Handler splashHandler;
    private Runnable splashRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Optimization: Use setContentView directly for static screens to avoid ViewBinding overhead
        setContentView(R.layout.activity_splash);

        splashHandler = new Handler(Looper.getMainLooper());
        splashRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        // Perceived performance: 2000ms delay instead of 3000ms
        splashHandler.postDelayed(splashRunnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Performance: Prevent memory leaks by removing callbacks when activity is destroyed
        if (splashHandler != null && splashRunnable != null) {
            splashHandler.removeCallbacks(splashRunnable);
        }
    }
}
