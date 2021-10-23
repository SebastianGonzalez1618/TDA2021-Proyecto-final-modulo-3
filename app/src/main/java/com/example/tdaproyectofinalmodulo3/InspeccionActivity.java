package com.example.tdaproyectofinalmodulo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tdaproyectofinalmodulo3.databinding.ActivityInspeccionBinding;
import com.example.tdaproyectofinalmodulo3.model.Departamento;
import com.example.tdaproyectofinalmodulo3.viewmodel.DepartamentoViewModel;

public class InspeccionActivity extends AppCompatActivity {

    ActivityInspeccionBinding b;
    NavController nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityInspeccionBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        NavHostFragment host = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navFrag);
        nav = host.getNavController();

        if (Probando.baseDeDatosNueva) {
            DepartamentoViewModel model = new ViewModelProvider(this).get(DepartamentoViewModel.class);

            for (int i = 1; i <= 10; i++) {
                Departamento depa = new Departamento(i
                        , "nombreProyecto " + i
                        , "direccionProyecto " + i
                        , "departamento " + i
                        , "imagenProyecto " + i
                        , false
                        , false
                        , false
                        , false
                        , ""
                        , 0);
                model.agregar(depa);
            }
        }
    }

}