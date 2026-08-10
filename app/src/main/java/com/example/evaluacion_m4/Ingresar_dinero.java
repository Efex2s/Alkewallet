package com.example.evaluacion_m4;

import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
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
                binding.editTextText2.setError("La cantidad no puede estar vacía");
                return;
            }
            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    binding.editTextText2.setError("La cantidad debe ser mayor que cero");
                    return;
                }
            } catch (NumberFormatException e) {
                binding.editTextText2.setError("Cantidad no válida");
                return;
            }

            // Success feedback and transition back
            Toast.makeText(this, "¡Ingreso de $" + amountStr + " realizado con éxito!", Toast.LENGTH_SHORT).show();
            onBackPressed();
        });
    }
}
