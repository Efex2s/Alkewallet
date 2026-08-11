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

    // Handler y Runnable referenciados para evitar fugas de memoria
    private Handler splashHandler;
    private Runnable splashRunnable;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Instanciamos el Handler con el Looper principal de forma segura
        splashHandler = new Handler(Looper.getMainLooper());
        splashRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        };

        // Reducimos el retraso de 3000ms a 1000ms para mejorar el tiempo de carga percibido (TTI)
        splashHandler.postDelayed(splashRunnable, 1000);
    }

    @Override
    protected void onDestroy() {
        // Removemos las llamadas pendientes para prevenir fugas de contexto o crashes si se destruye la actividad antes
        if (splashHandler != null && splashRunnable != null) {
            splashHandler.removeCallbacks(splashRunnable);
        }
        super.onDestroy();
    }
}
