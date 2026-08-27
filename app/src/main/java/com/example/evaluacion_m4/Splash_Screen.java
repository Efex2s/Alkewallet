package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    private @NonNull ActivitySplashBinding binding;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization:
        // 1. Reduced delay from 3000ms to 1000ms to significantly reduce Time to Interactive (TTI) for users.
        // 2. Explicitly bind Handler to Looper.getMainLooper() for explicit thread safety and avoid deprecated default constructor.
        handler = new Handler(Looper.getMainLooper());
        runnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };
        handler.postDelayed(runnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory Leak Prevention:
        // Clear pending handler callbacks when activity is destroyed before delay finishes.
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
