package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Time to interactive optimization: reduced splash delay from 3000ms to 1000ms
    private static final long SPLASH_DELAY_MS = 1000L;

    private @NonNull ActivitySplashBinding binding;
    private Handler splashHandler;
    private Runnable splashRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Explicitly bind Handler to main thread Looper to prevent deprecation & threading issues
        splashHandler = new Handler(Looper.getMainLooper());
        splashRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        splashHandler.postDelayed(splashRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Prevent memory leaks if activity is destroyed before delay finishes
        if (splashHandler != null && splashRunnable != null) {
            splashHandler.removeCallbacks(splashRunnable);
        }
    }
}