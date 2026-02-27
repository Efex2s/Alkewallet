package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Splash Screen activity that shows the app branding and redirects to the landing page.
 * Optimized for performance and memory safety.
 */
public class Splash_Screen extends AppCompatActivity {

    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable runnable = () -> {
        Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
        startActivity(intent);
        finish();
    };

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        // Optimization: Use direct inflation for static layout to reduce object allocation overhead (no ViewBinding needed here)
        setContentView(R.layout.activity_splash);

        // Optimization: Reduced delay to 2000ms for faster perceived app startup
        handler.postDelayed(runnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory Management: Remove callbacks to prevent memory leaks if activity is destroyed before execution
        handler.removeCallbacks(runnable);
    }
}
