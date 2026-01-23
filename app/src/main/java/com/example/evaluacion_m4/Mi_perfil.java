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

    private  ActivityLoginPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_perfil);

        ImageButton btnBack = findViewById(R.id.imageButton4);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                onBackPressed();
            }
        });
    }
}






