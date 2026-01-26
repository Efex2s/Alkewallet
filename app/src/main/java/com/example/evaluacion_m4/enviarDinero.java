package com.example.evaluacion_m4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.evaluacion_m4.databinding.ActivityEnviarDineroBinding;
import com.example.evaluacion_m4.databinding.ActivityLoginPageBinding;

public class enviarDinero extends AppCompatActivity {

    private  ActivityEnviarDineroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnviarDineroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.flechaDireccion.setOnClickListener(view -> onBackPressed());
        binding.btnEnviarDinero.setOnClickListener(view -> onBackPressed());

    }
}
//Evaluación módulo 4