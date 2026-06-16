package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivityLoginSingupPageBinding;
import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    //declaramos el binding de la clase

    private @NonNull ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // BOLT OPTIMIZATION: Reduced splash delay from 3000ms to 1000ms.
        // Modern UX research suggests that splash screens should be as short as possible
        // to improve perceived app performance and user retention.
        // Also using Looper.getMainLooper() for thread safety and to avoid potential memory leaks.
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}