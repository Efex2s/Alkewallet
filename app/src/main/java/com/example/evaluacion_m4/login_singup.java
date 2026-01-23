package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.evaluacion_m4.databinding.ActivityLoginPageBinding;
import com.example.evaluacion_m4.databinding.ActivityLoginSingupBinding;

public class login_singup extends AppCompatActivity {

    //declaramos el binding

    private  ActivityLoginSingupBinding binding;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        binding = ActivityLoginSingupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //botón de registro de usuarios

        binding.btnSingUpPage.setOnClickListener(v->{
            startActivity( new Intent(this, Home_Page.class));
            finish();
        });

        //accion del texto-Ya tiene cuenta?

        binding.tvYaTienesCuentaSingUpPage.setOnClickListener(v->{
           finish();
        });
    }


}