package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // ⚡ Bolt Optimization: Reduced artificial splash delay from 3000ms to 1000ms to improve TTI.
    private static final long SPLASH_DELAY_MS = 1000L;

    private @NonNull ActivitySplashBinding binding;
    private Handler handler;
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Explicitly bind Handler to Main Looper for main thread safety and to prevent deprecation issues.
        handler = new Handler(Looper.getMainLooper());
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
        // Remove callbacks to avoid potential activity context memory leaks if destroyed early.
        if (handler != null && navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
