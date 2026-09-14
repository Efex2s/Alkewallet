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

    // Bolt Optimization: Explicit Looper-bound Handler reference to manage lifecycle safely
    private Handler splashHandler;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Bolt Optimization: Explicit Looper binding prevents handler deprecation warnings on API 30+.
        // Delay reduced from 3000ms to 1000ms to significantly improve cold-start Time To Interactive (TTI).
        splashHandler = new Handler(Looper.getMainLooper());
        splashHandler.postDelayed(() -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        }, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Bolt Optimization: Clear handler callbacks to prevent activity leaks or execution after destruction
        if (splashHandler != null) {
            splashHandler.removeCallbacksAndMessages(null);
        }
    }
}