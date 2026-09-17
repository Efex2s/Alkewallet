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
    private Handler splashHandler;
    private Runnable navigateRunnable;

    // Reduced splash delay from 3000ms to 1000ms to improve Time to Interactive (TTI)
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Explicitly bind Handler to main looper to prevent deprecation warnings and thread mismatch
        splashHandler = new Handler(Looper.getMainLooper());
        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        splashHandler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clear pending handler callbacks to prevent activity leaks if destroyed prematurely
        if (splashHandler != null && navigateRunnable != null) {
            splashHandler.removeCallbacks(navigateRunnable);
        }
    }
}
