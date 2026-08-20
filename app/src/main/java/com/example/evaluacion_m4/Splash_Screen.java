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

    // Reduced splash delay from 3000ms to 1000ms to improve TTI (Time To Interactive)
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Explicitly pass Looper.getMainLooper() for main thread safety and to avoid deprecation warnings
        handler = new Handler(Looper.getMainLooper());
        runnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        handler.postDelayed(runnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clear pending delayed callbacks to prevent memory leaks if activity is destroyed prematurely
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
