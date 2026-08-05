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

    // Referencias para evitar fugas de memoria (Memory Leaks) al destruir la Activity
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Usamos el constructor explícito con Looper.getMainLooper() para evitar obsolescencia (deprecation)
        // y asegurar que se ejecute de manera segura en el hilo principal de la UI.
        handler = new Handler(Looper.getMainLooper());
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };

        // Reducimos el retardo inicial de 3000ms a 1000ms para mejorar el tiempo de interactividad (TTI)
        handler.postDelayed(runnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Liberamos los callbacks pendientes en el Handler para prevenir memory leaks
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}