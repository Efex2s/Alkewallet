package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Declaramos el binding de la clase
    private @NonNull ActivitySplashBinding binding;

    // Performance Optimization: Explicit Handler bound to main thread Looper & runnable reference for cleanup
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable navigateRunnable;

    // Reduced splash screen delay from 3000ms to 1000ms to significantly improve Time to Interactive (TTI)
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        handler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Prevent memory leak if activity is destroyed before handler delay completes
        if (handler != null && navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
