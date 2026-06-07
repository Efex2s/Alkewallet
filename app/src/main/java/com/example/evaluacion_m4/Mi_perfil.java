package com.example.evaluacion_m4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.evaluacion_m4.databinding.ActivityMiPerfilBinding;

public class Mi_perfil extends AppCompatActivity {

    private  ActivityMiPerfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMiPerfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnImageButton4.setOnClickListener(v->{
            getOnBackPressedDispatcher().onBackPressed();
        });
    }
}
