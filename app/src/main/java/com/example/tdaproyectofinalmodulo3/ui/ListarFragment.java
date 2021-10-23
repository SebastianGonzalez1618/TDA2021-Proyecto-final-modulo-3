package com.example.tdaproyectofinalmodulo3.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tdaproyectofinalmodulo3.R;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tdaproyectofinalmodulo3.R;
import com.example.tdaproyectofinalmodulo3.adapter.DepartamentoAdapter;
import com.example.tdaproyectofinalmodulo3.databinding.FragmentListarBinding;
import com.example.tdaproyectofinalmodulo3.model.Departamento;
import com.example.tdaproyectofinalmodulo3.viewmodel.DepartamentoViewModel;

public class ListarFragment extends Fragment {

    FragmentListarBinding b;
    DepartamentoViewModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b = FragmentListarBinding.inflate(inflater,container,false);
        model = new ViewModelProvider(this).get(DepartamentoViewModel.class);

        DepartamentoAdapter adapter = new DepartamentoAdapter(model);
        b.rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        b.rvLista.setAdapter(adapter);

        Log.d("DEBUG", "ListarFragmento.java > 1");
        adapter.setListener(depa -> {
            Bundle bundle = new Bundle();
            bundle.putInt("id",depa.getIdDepartamento());
            Navigation.findNavController(container).navigate(R.id.action_listarFragment_to_inspeccionFragment,bundle);
        });

        Log.d("DEBUG", "ListarFragmento.java > 2");
        model.getLista().observe(getViewLifecycleOwner(),departamentos -> {
            adapter.setLista(departamentos);
        });


        return b.getRoot();
    }
}