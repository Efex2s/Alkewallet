package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Reduced splash screen delay from 3000ms to 1000ms to improve launch Time to Interactive (TTI)
    private static final long SPLASH_DELAY = 1000L;

    private @NonNull ActivitySplashBinding binding;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        // Post delayed navigation using explicit main Looper
        handler.postDelayed(navigateRunnable, SPLASH_DELAY);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove callbacks to prevent memory leak if Activity is destroyed prior to delay completion
        if (navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
