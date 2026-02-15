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
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // BOLT: Optimized startup by reducing artificial splash delay from 3s to 1s.
        // Also using Looper.getMainLooper() for modern Android compliance and better stability.
        handler = new Handler(Looper.getMainLooper());
        runnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };
        handler.postDelayed(runnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // BOLT: Prevent memory leaks if activity is destroyed before timer triggers.
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}