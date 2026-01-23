package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivityHomePageEmptyBinding;


public class Home_Page extends AppCompatActivity {

    private ActivityHomePageEmptyBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePageEmptyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //Botón Enviar dinero
        binding.btnEnviarDinero.setOnClickListener(v -> {
            startActivity(new Intent(this, enviarDinero.class));
        });
        //Botón Ingresar dinero
        binding.btnIngresarDinero.setOnClickListener(v -> {
            startActivity(new Intent(this, Ingresar_dinero.class));
        });
    }

}