package com.example.tdaproyectofinalmodulo3.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;


import com.example.tdaproyectofinalmodulo3.model.Departamento;
import com.example.tdaproyectofinalmodulo3.repository.DepartamentoRepository;

public class DepartamentoViewModel extends AndroidViewModel {

    private DepartamentoRepository depaRepo;
    private LiveData<List<Departamento>> lista;
    private LiveData<Departamento> depa;


    public DepartamentoViewModel(@NonNull Application application) {
        super(application);
        depaRepo = new DepartamentoRepository(application);
        lista = depaRepo.listar();
    }

    public LiveData<List<Departamento>> getLista() {
        return lista;
    }

    public LiveData<Departamento> getDepa() {
        return depa;
    }

    public void agregar(Departamento depa)
    {
        depaRepo.agregar(depa);
    }

    public void eliminar(Departamento depa)
    {
        depaRepo.eliminar(depa);
    }

    public void buscar(int id)
    {
        depa = depaRepo.buscar(id);
    }

    public void actualizar(Departamento depa)
    {
        depaRepo.actualizar(depa);
    }

}
