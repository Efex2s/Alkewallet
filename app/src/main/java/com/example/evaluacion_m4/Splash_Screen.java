package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    private @NonNull ActivitySplashBinding binding;
    private Handler handler;
    private Runnable navigateRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Performance Optimization: Reduce splash screen delay from 3000ms to 1000ms
        // to significantly improve Time to Interactive (TTI) for users on app launch.
        // Also use Looper.getMainLooper() explicitly to ensure thread safety and eliminate deprecation warnings.
        handler = new Handler(Looper.getMainLooper());
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
        // Prevent activity context leaks by removing pending callbacks when Activity is destroyed
        if (handler != null && navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
