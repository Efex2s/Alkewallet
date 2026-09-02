package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // Performance optimization: Reduce splash delay to 1000ms (1s) to improve Time to Interactive (TTI)
    private static final long SPLASH_DELAY_MS = 1000L;

    // Declaramos el binding de la clase
    private @NonNull ActivitySplashBinding binding;

    // Explicit main thread handler and runnable stored to avoid memory leaks
    private final Handler handler = new Handler(Looper.getMainLooper());
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

        // Post delayed navigation to main thread Handler
        handler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Prevent Activity context memory leak if destroyed before splash timeout completes
        handler.removeCallbacks(navigateRunnable);
    }
}
