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
    // Bolt: Retain Handler and Runnable to allow cleanup and avoid memory leaks
    private Handler splashHandler;
    private Runnable splashRunnable;

    // Bolt: Reduced splash delay from 3000ms to 1000ms to improve app Time to Interactive (TTI)
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Bolt: Explicitly specify Looper.getMainLooper() for thread safety (avoid deprecated Handler() constructor)
        splashHandler = new Handler(Looper.getMainLooper());
        splashRunnable = () -> {
            if (!isFinishing() && !isDestroyed()) {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };

        splashHandler.postDelayed(splashRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        // Bolt: Clear pending callbacks to prevent leaking the Activity context if destroyed before delay expires
        if (splashHandler != null && splashRunnable != null) {
            splashHandler.removeCallbacks(splashRunnable);
        }
        super.onDestroy();
    }
}
