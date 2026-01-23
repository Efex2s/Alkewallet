package com.example.evaluacion_m4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.evaluacion_m4.databinding.ActivityIngresarDinero2Binding;
import com.example.evaluacion_m4.databinding.ActivityLoginPageBinding;

public class Ingresar_dinero extends AppCompatActivity {


    private ActivityIngresarDinero2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIngresarDinero2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setContentView(R.layout.activity_ingresar_dinero2);



        binding.flechaDireccion.setOnClickListener(v -> onBackPressed());
        binding.button5.setOnClickListener(v -> onBackPressed());
    }



}