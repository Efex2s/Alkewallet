package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash Screen activity that handles initial app branding and transition to landing page.
 * Optimized for startup performance and memory safety.
 */
public class Splash_Screen extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        // Performance optimization: Using direct layout inflation instead of ViewBinding
        // for static activities with no programmatic view interaction.
        setContentView(R.layout.activity_splash);

        // Memory safety: Store references to handler and runnable to clean up in onDestroy
        handler = new Handler(Looper.getMainLooper());
        runnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        // UX optimization: Reduced splash delay from 3000ms to 2000ms for faster time-to-interactive.
        handler.postDelayed(runnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Prevent memory leaks by removing callbacks when activity is destroyed
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
