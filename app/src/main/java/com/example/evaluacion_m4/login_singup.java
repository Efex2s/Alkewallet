package com.example.evaluacion_m4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.evaluacion_m4.databinding.ActivityLoginSingupBinding;

public class login_singup extends AppCompatActivity {

    //declaramos el binding, igual que las otras clases

    private  ActivityLoginSingupBinding binding;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        binding = ActivityLoginSingupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //botón de registro de usuarios

        binding.btnSingUpPage.setOnClickListener(v->{
            Intent intent = new Intent(this, Home_Page_Empty.class);
            startActivity(intent);
            finish();


        });

        //accion del texto-Ya tiene cuenta?

        binding.tvYaTienesCuentaSingUpPage.setOnClickListener(v->{

            Intent intent = new Intent(this, Login_page.class);
            startActivity(intent);
           finish();
        });
    }


}