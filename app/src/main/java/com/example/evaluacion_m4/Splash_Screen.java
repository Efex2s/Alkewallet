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
    private Handler splashHandler;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance optimization: Reduce splash delay from 3000ms to 1000ms for faster Time to Interactive (TTI).
        // Pass explicit Looper.getMainLooper() to avoid deprecation and ensure thread safety.
        splashHandler = new Handler(Looper.getMainLooper());
        splashHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory leak prevention: cancel pending handler callbacks if activity is destroyed early
        if (splashHandler != null) {
            splashHandler.removeCallbacksAndMessages(null);
        }
    }
}