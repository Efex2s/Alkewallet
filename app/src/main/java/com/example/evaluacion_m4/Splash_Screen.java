package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash Screen activity that serves as the entry point of the application.
 * Optimized for performance by reducing inflation overhead and improving TTI.
 */
public class Splash_Screen extends AppCompatActivity {

    private static final int SPLASH_DELAY = 2000;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable runnable = () -> {
        Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
        startActivity(intent);
        finish();
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Optimization: Use setContentView directly for static layouts to reduce inflation overhead and object allocation
        setContentView(R.layout.activity_splash);

        // Optimization: Use SPLASH_DELAY of 2000ms for better UX and perceived performance
        handler.postDelayed(runnable, SPLASH_DELAY);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Optimization: Remove callbacks to prevent memory leaks if activity is destroyed before delay finishes
        handler.removeCallbacks(runnable);
    }
}
