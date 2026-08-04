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

    // Guardamos la referencia al Handler para evitar memory leaks al destruir el Activity
    private Handler handler;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Usamos Looper.getMainLooper() para evitar advertencias de deprecación y asegurar la ejecución en el hilo principal
        handler = new Handler(Looper.getMainLooper());

        // Reducimos el retardo artificial de 3000ms a 1000ms para mejorar la métrica TTI (Time to Interactive)
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Login_Singup_page.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            // Cancelamos todos los callbacks pendientes para prevenir memory leaks
            handler.removeCallbacksAndMessages(null);
        }
    }
}