package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Performance Optimization: Explicit main thread Handler and Runnable tracking to prevent memory leaks and improve TTI
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable splashRunnable;

    private @NonNull ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Reduced artificial splash delay from 3000ms to 1000ms to improve TTI (Time To Interactive) by 2s
        splashRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        handler.postDelayed(splashRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove pending delayed callbacks to prevent memory leaks if Activity is destroyed early
        if (splashRunnable != null) {
            handler.removeCallbacks(splashRunnable);
        }
    }
}
