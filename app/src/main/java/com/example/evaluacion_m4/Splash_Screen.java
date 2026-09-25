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

    // Optimization: Store Handler and Runnable references to clear callbacks on destroy and avoid memory leaks
    private Handler splashHandler;
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Optimization: Reduced splash delay from 3000ms to 1000ms to improve Time To Interactive (TTI)
        // and explicitly specified Looper.getMainLooper() for thread safety.
        splashHandler = new Handler(Looper.getMainLooper());
        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        splashHandler.postDelayed(navigateRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Optimization: Remove pending callbacks to prevent memory leaks if activity finishes early
        if (splashHandler != null && navigateRunnable != null) {
            splashHandler.removeCallbacks(navigateRunnable);
        }
    }
}