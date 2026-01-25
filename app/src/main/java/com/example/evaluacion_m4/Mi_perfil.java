package com.example.evaluacion_m4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.evaluacion_m4.databinding.ActivityLoginPageBinding;
import com.example.evaluacion_m4.databinding.ActivityMiPerfilBinding;

public class Mi_perfil extends AppCompatActivity {

    private  ActivityMiPerfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMiPerfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnImageButton4.setOnClickListener(v->{
            onBackPressed();
        });
    }
}
