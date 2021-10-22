package com.example.tdaproyectofinalmodulo3.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;


import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.tdaproyectofinalmodulo3.model.Departamento;
import com.example.tdaproyectofinalmodulo3.room.AppDatabase;

import java.util.List;

public class DepartamentoRepository {

    private AppDatabase mDB;

    public DepartamentoRepository(Application application) {
        mDB = AppDatabase.getInstance(application);
    }

    public void agregar(Departamento depa)
    {
        AppDatabase.databaseWriteExecutor.execute(()->{
            mDB.departamentoDao().agregar(depa);
        });
    }

    public void eliminar(Departamento depa)
    {
        AppDatabase.databaseWriteExecutor.execute(()->{
            mDB.departamentoDao().eliminar(depa);
        });
    }

    public void actualizar(Departamento depa)
    {
        AppDatabase.databaseWriteExecutor.execute(()->{
            mDB.departamentoDao().actualizar(depa);
        });
    }

    public LiveData<List<Departamento>> listar()
    {
        return mDB.departamentoDao().listar();
    }

    public LiveData<Departamento> buscar(int id)
    {
        return mDB.departamentoDao().buscar(id);
    }
}
