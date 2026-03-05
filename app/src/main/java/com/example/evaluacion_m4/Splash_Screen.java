package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

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
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        // Optimization: Direct layout inflation instead of ViewBinding for static activity
        setContentView(R.layout.activity_splash);

        // Memory safety: Scheduled task using member variables for lifecycle management
        handler.postDelayed(runnable, 2000); // Reduced delay for faster TTI
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory safety: Remove callbacks to prevent memory leaks if activity is destroyed
        handler.removeCallbacks(runnable);
    }
}