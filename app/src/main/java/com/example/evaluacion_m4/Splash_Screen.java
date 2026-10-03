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

    // Handler and Runnable instances kept to safely clean up in onDestroy and prevent memory leaks
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable navigateRunnable;

    // Reduced splash timeout duration (1000ms instead of 3000ms) to improve TTI (Time to Interactive)
    private static final long SPLASH_DELAY_MS = 1000L;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navigateRunnable = () -> {
            if (!isFinishing() && !isDestroyed()) {
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
        // Remove pending callbacks to avoid memory leaks if the Activity is destroyed before timer completes
        if (navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}