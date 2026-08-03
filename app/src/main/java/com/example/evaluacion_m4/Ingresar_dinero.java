package com.example.evaluacion_m4;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivityIngresarDinero2Binding;

public class Ingresar_dinero extends AppCompatActivity {

    private ActivityIngresarDinero2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIngresarDinero2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.flechaDireccion.setOnClickListener(v -> onBackPressed());

        binding.button5.setOnClickListener(v -> {
            String amountStr = binding.editTextText2.getText().toString().trim();
            if (amountStr.isEmpty()) {
                binding.editTextText2.setError("Por favor, ingresa una cantidad válida");
                return;
            }
            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    binding.editTextText2.setError("La cantidad debe ser mayor a cero");
                    return;
                }
                Toast.makeText(this, "¡Depósito exitoso de $" + amountStr + "!", Toast.LENGTH_SHORT).show();
                onBackPressed();
            } catch (NumberFormatException e) {
                binding.editTextText2.setError("Cantidad no válida");
            }
        });
    }
}
