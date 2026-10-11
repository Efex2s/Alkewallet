package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

/**
 * Splash screen activity that navigates to Login_Singup_page.
 *
 * Performance optimizations:
 * - Reduced delay from 3000ms to 1000ms to improve Time to Interactive (TTI) on launch.
 * - Explicitly uses Looper.getMainLooper() with Handler to prevent API 30+ deprecation issues and ensure UI thread execution.
 * - Stores Runnable reference and cancels callbacks in onDestroy() to prevent Activity context leaks.
 */
public class Splash_Screen extends AppCompatActivity {

    // Splash transition delay in milliseconds
    private static final long SPLASH_DELAY_MS = 1000L;

    private @NonNull ActivitySplashBinding binding;
    private Handler handler;
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Construct Handler tied explicitly to the main thread's Looper
        handler = new Handler(Looper.getMainLooper());
        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        // Post delayed transition to login/signup page
        handler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Prevent memory leaks by removing callbacks if activity is destroyed before delay completes
        if (handler != null && navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
