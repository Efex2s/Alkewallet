package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.evaluacion_m4.databinding.ActivityLoginPageBinding;

public class Login_page extends AppCompatActivity {

    private ActivityLoginPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Botón del login
        binding.buttonActivity2.setOnClickListener(v -> {
            startActivity(new Intent(this, Home_Page.class));
            finish();

        //text view para crear cuenta
        });
        binding.textView3.setOnClickListener(v -> {
            startActivity(new Intent(this, Login_Singup_page.class));




        });
    }
}

