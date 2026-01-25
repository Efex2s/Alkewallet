package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evaluacion_m4.databinding.ActivityLoginSingupBinding;
import com.example.evaluacion_m4.databinding.ActivityLoginSingupPageBinding;

public class Login_Singup_page extends AppCompatActivity {


    //declaramos el binding

    private ActivityLoginSingupPageBinding binding;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        binding = ActivityLoginSingupPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCrearCuenta.setOnClickListener(v->{
            startActivity( new Intent(this, login_singup.class));

        });

        //accion del texto-Ya tiene cuenta?

        binding.tvYatienesCuenta.setOnClickListener(v->{
            startActivity(new Intent(this, Login_page.class));
        });


    }
}
