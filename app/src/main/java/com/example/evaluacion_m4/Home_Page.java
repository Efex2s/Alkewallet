package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// Asegúrate que tu primer XML se llame activity_home_page.xml
import com.example.evaluacion_m4.databinding.ActivityHomePage2Binding;

public class Home_Page extends AppCompatActivity {

    private ActivityHomePage2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePage2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. Enviar Dinero
        binding.btnEnviarDinero.setOnClickListener(v -> {
            startActivity(new Intent(this, enviarDinero.class));
        });

        // 2. Ingresar Dinero
        binding.btnIngresarDinero.setOnClickListener(v -> {
            startActivity(new Intent(this, Ingresar_dinero.class));
        });

        // 3. Abrir Perfil (Usando el id imageView del círculo)
        binding.imageView.setOnClickListener(v -> {
            startActivity(new Intent(this, Mi_perfil.class));
        });
    }
}