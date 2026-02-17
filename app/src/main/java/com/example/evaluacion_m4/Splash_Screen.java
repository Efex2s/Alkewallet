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

    // Bolt optimization: use Handler with Looper and store reference to prevent memory leaks
    private final Handler splashHandler = new Handler(Looper.getMainLooper());
    private final Runnable transitionRunnable = new Runnable() {
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

        // Bolt optimization: Reduce delay from 3000ms to 2000ms for faster perceived startup
        splashHandler.postDelayed(transitionRunnable, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Bolt optimization: Remove callbacks to prevent memory leaks when activity is destroyed
        splashHandler.removeCallbacks(transitionRunnable);
    }
}