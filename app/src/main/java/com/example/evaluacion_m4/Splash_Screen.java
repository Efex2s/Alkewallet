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
    // Explicitly bind Handler to Main Looper to prevent deprecation issues and ensure UI thread safety
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        runnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        // Performance Optimization: Reduced splash screen delay from 3000ms to 1000ms
        // to significantly improve Time to Interactive (TTI) for launching the app.
        handler.postDelayed(runnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory Leak Prevention: Clear handler callbacks when activity is destroyed
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
