package com.example.tdaproyectofinalmodulo3.ui;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tdaproyectofinalmodulo3.R;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tdaproyectofinalmodulo3.R;
import com.example.tdaproyectofinalmodulo3.databinding.FragmentInspeccionBinding;
import com.example.tdaproyectofinalmodulo3.model.Departamento;
import com.example.tdaproyectofinalmodulo3.viewmodel.DepartamentoViewModel;


public class InspeccionFragment extends Fragment {

    public class AgregarFragment extends Fragment {


        FragmentInspeccionBinding b;
        DepartamentoViewModel model;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            Log.d("DEBUG", "InspeccionFragment.java > Entrar");
            // Inflate the layout for this fragment
            b = FragmentInspeccionBinding.inflate(inflater,container,false);

            model = new ViewModelProvider(this).get(DepartamentoViewModel.class);

            int id = getArguments().getInt("id");
            model.buscar(id);

            model.getDepa().observe(getViewLifecycleOwner(),depa -> {

                b.tvProyecto.setText(depa.getNombreProyecto());
                b.tvDepartamento.setText(depa.getDepartamento());
                b.cbLuces.setChecked(depa.isLuces());
                b.cbBanio.setChecked(depa.isElementosBanio());
                b.cbCocina.setChecked(depa.isElementosCocina());
                b.cbDormitorio.setChecked(depa.isElementosDormitorio());

            });

/*
            b.btnListar.setOnClickListener(v ->{
                Navigation.findNavController(v).navigate(R.id.action_agregarFragment_to_listarFragment);
            });


            b.btnGuardar.setOnClickListener(v -> {

                boolean luces =
                String nombre = b.txtNombre.getEditText().getText().toString();
                String precio = b.txtPrecio.getEditText().getText().toString();

                Producto pro = new Producto(nombre,Integer.parseInt(precio));
                model.agregar(pro);

                AlertDialog.Builder alerta = new AlertDialog.Builder(getContext());
                alerta.setTitle("Producto");
                alerta.setMessage("Producto Agregado");

                alerta.setNeutralButton("ok",(dialog, which) -> {
                    dialog.cancel();
                    b.txtNombre.getEditText().setText("");
                    b.txtPrecio.getEditText().setText("");
                });

//            alerta.setPositiveButton("si",(dialog, which) -> {
//
//            });

//            alerta.setNegativeButton("No",(dialog, which) -> {
//                dialog.cancel(); // cerrar el dialog
//            });

                alerta.show();

            });
*/
            return b.getRoot();
        }
    }

}