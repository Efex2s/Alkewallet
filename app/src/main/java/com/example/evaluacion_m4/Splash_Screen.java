package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    //declaramos el binding de la clase

    private @NonNull ActivitySplashBinding binding;

    // Optimization: Store Handler and Runnable references to clear callbacks on destroy and prevent memory leaks.
    private Handler handler;
    private Runnable navigateRunnable;

    // Optimization: Reduced delay from 3000ms to 1000ms to significantly improve app Time To Interactive (TTI).
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        handler = new Handler(Looper.getMainLooper());
        navigateRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };

        handler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Optimization: Remove callbacks to avoid memory leaks when activity is destroyed prematurely.
        if (handler != null && navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}