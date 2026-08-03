package com.example.evaluacion_m4;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivityEnviarDineroBinding;

public class enviarDinero extends AppCompatActivity {

    private ActivityEnviarDineroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnviarDineroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.flechaDireccion.setOnClickListener(view -> onBackPressed());

        binding.btnEnviarDinero.setOnClickListener(view -> {
            String amountStr = binding.editTextText5.getText().toString().trim();
            if (amountStr.isEmpty()) {
                binding.editTextText5.setError("Por favor, ingresa una cantidad válida");
                return;
            }
            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    binding.editTextText5.setError("La cantidad debe ser mayor a cero");
                    return;
                }
                Toast.makeText(this, "¡Transferencia exitosa de $" + amountStr + "!", Toast.LENGTH_SHORT).show();
                onBackPressed();
            } catch (NumberFormatException e) {
                binding.editTextText5.setError("Cantidad no válida");
            }
        });
    }
}
