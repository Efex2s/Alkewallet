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
    private Runnable splashRunnable;

    // Reduced delay duration (1000ms) to improve app startup speed and Time to Interactive (TTI)
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization: Explicitly pass Looper.getMainLooper() for main thread safety
        handler = new Handler(Looper.getMainLooper());
        splashRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        handler.postDelayed(splashRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory Leak Prevention: Remove delayed callbacks when activity is destroyed
        if (handler != null && splashRunnable != null) {
            handler.removeCallbacks(splashRunnable);
        }
    }
}
