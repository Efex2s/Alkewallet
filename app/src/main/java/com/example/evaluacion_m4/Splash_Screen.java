package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivitySplashBinding;

public class Splash_Screen extends AppCompatActivity {

    // declaramos el binding de la clase y la referencia al handler/runnable para evitar memory leaks
    private @NonNull ActivitySplashBinding binding;
    private Handler handler;
    private Runnable navigateRunnable;

    // Reducimos el tiempo de espera de la pantalla de inicio para mejorar el Time to Interactive (TTI)
    private static final long SPLASH_DELAY_MS = 1000L; // 1 segundo (antes 3 segundos)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Usamos Looper.getMainLooper() explícitamente para garantizar la ejecución en el hilo principal
        handler = new Handler(Looper.getMainLooper());
        navigateRunnable = () -> {
            Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
            startActivity(intent);
            finish();
        };

        handler.postDelayed(navigateRunnable, SPLASH_DELAY_MS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Cancelar callbacks pendientes para evitar leaks de memoria de la Activity
        if (handler != null && navigateRunnable != null) {
            handler.removeCallbacks(navigateRunnable);
        }
    }
}
