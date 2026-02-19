package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash Screen activity that handles the initial app branding and transition to the landing page.
 * Optimized for performance by reducing memory overhead and improving Time To Interactive (TTI).
 */
public class Splash_Screen extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Optimized: avoid ViewBinding for static activities to reduce object allocation and memory usage.
        setContentView(R.layout.activity_splash);

        // Optimized: Use Looper.getMainLooper() for Handler to follow Android best practices.
        handler = new Handler(Looper.getMainLooper());
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };

        // Optimized: reduced delay from 3000ms to 2000ms to improve perceived app startup speed.
        handler.postDelayed(runnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Lifecycle Safety: prevent potential memory leaks by removing callbacks when activity is destroyed.
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
