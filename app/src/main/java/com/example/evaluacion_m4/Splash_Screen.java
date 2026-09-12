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
    private final Handler splashHandler = new Handler(Looper.getMainLooper());
    private Runnable splashRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization: Reduced delay from 3000ms to 1000ms for faster Time-To-Interactive (TTI)
        // Main thread explicit Looper binding avoids Handler deprecation and thread safety issues.
        splashRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        splashHandler.postDelayed(splashRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory Leak Prevention: Remove delayed execution callbacks if Activity is destroyed early.
        if (splashRunnable != null) {
            splashHandler.removeCallbacks(splashRunnable);
        }
    }
}
