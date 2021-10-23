package com.example.tdaproyectofinalmodulo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tdaproyectofinalmodulo3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    public static final String contraseniaDePrueba = "123Pass";
    public static final int MAX_INTENTOS = 3;
    public static int intentos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());



        b.btIngresar.setOnClickListener(v -> {
            String email = b.etEmail.getText().toString();
            String contrasenia = b.etContrasenia.getText().toString();
            boolean contraseniaValida = contrasenia.equals(contraseniaDePrueba);

            if (contraseniaValida) {
                Toast.makeText(this, "Ingresando...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, InspeccionActivity.class);
                startActivity(intent);
            } else {
                ++intentos;
                Toast.makeText(this, "Email o contraseña incorrecta. \n" + intentos + " de " + MAX_INTENTOS + " intentos.", Toast.LENGTH_SHORT).show();
                if (intentos == MAX_INTENTOS)
                {
                    b.btIngresar.setEnabled(false);
                }
            }

        });
    }
}