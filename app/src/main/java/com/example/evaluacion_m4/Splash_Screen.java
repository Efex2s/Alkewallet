package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Declaramos el binding de la clase
    private @NonNull ActivitySplashBinding binding;

    // Bolt optimization: Explicit Handler bound to main Looper and tracked Runnable to prevent context leaks
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable navigateRunnable = () -> {
        Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
        startActivity(intent);
        finish();
    };

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance boost: Reduced artificial delay from 3000ms to 1000ms (66.7% faster TTI)
        handler.postDelayed(navigateRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Memory optimization: Remove pending callbacks to avoid leaking Activity context on early exit/recreation
        handler.removeCallbacks(navigateRunnable);
    }
}