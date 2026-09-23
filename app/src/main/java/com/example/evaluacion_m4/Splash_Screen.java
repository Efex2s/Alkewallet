package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    private ActivitySplashBinding binding;
    private Handler splashHandler;
    private Runnable splashRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization: Reduce splash screen delay from 3000ms to 1000ms to improve TTI
        // Explicitly pass main thread Looper for thread safety on Android API 30+
        splashHandler = new Handler(Looper.getMainLooper());
        splashRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };
        splashHandler.postDelayed(splashRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory Leak Prevention: Remove delayed callbacks when Activity is destroyed
        if (splashHandler != null && splashRunnable != null) {
            splashHandler.removeCallbacks(splashRunnable);
        }
    }
}
