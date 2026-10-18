package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Performance Optimization (Bolt):
    // 1. Reduced splash delay from 3000ms to 1000ms to improve Time to Interactive (TTI).
    // 2. Explicitly bind Handler to Looper.getMainLooper() to ensure thread safety and avoid Handler deprecation.
    // 3. Keep references to Handler and Runnable to remove callbacks in onDestroy(), avoiding activity leaks.
    private static final long SPLASH_DELAY_MS = 1000L;

    private @NonNull ActivitySplashBinding binding;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable navigateRunnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        handler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Cancel pending postDelayed callbacks to prevent Activity context memory leaks.
        handler.removeCallbacks(navigateRunnable);
    }
}
