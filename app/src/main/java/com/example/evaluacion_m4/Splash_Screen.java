package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash screen activity that handles application initialization.
 * Optimized for startup speed and memory safety.
 */
public class Splash_Screen extends AppCompatActivity {

    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Using direct layout inflation instead of ViewBinding for faster startup and lower object allocation
        setContentView(R.layout.activity_splash);

        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };

        // Reduced delay from 3000ms to 2000ms for faster perceived startup (TTI)
        handler.postDelayed(runnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove callbacks to prevent memory leaks if the activity is destroyed before the runnable executes
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
