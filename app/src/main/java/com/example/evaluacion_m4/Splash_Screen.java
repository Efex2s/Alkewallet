package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash screen for the application.
 * Optimized for startup speed and memory efficiency.
 */
public class Splash_Screen extends AppCompatActivity {

    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Performance: Skip ViewBinding for static splash screens to reduce inflation time and allocations
        setContentView(R.layout.activity_splash);

        // Perceived performance improvement: Transition to main flow 1s earlier (3000ms -> 2000ms)
        handler.postDelayed(runnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Performance/Stability: Explicitly remove callback to prevent Activity leak
        handler.removeCallbacks(runnable);
    }
}
