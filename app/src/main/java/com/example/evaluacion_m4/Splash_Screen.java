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
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization: Reduced splash screen delay from 3000ms to 1000ms to improve TTI (Time to Interactive).
        // Explicitly using Looper.getMainLooper() ensures thread-safety and prevents handler leaks.
        navigateRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(navigateRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clear pending handler callbacks to prevent activity context memory leaks if activity is destroyed early
        if (navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
