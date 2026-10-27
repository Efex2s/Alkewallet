package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // declaramos el binding de la clase
    private @NonNull ActivitySplashBinding binding;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization: Reduced splash delay from 3000ms to 1000ms to improve TTI (Time to Interactive).
        // Explicitly use Looper.getMainLooper() to avoid deprecation and memory leaks.
        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        handler.postDelayed(navigateRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Prevent memory leak if activity is destroyed before delay completes
        if (navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}