package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash screen that serves as the entry point of the application.
 * Optimized by Bolt for faster startup and reduced memory overhead.
 */
public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Optimization: Use direct layout inflation instead of ViewBinding for static activity
        // to reduce object allocation and improve inflation time.
        setContentView(R.layout.activity_splash);

        // Optimization: Reduce delay from 3000ms to 2000ms to improve perceived speed.
        // Also using Looper.getMainLooper() for the Handler as per Android best practices.
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}
