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

    // Handler explicit binding to main looper to prevent thread issues & deprecation warning
    private final Handler handler = new Handler(Looper.getMainLooper());

    // Runnable retained to allow cleanup in onDestroy and prevent activity context leaks
    private final Runnable navigateRunnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Reduced artificial splash delay from 3000ms to 1000ms for faster Time to Interactive (TTI)
        handler.postDelayed(navigateRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        // Remove pending callbacks to avoid memory leaks when activity is destroyed early
        handler.removeCallbacks(navigateRunnable);
        super.onDestroy();
    }
}
