package com.example.tdaproyectofinalmodulo3.room;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.tdaproyectofinalmodulo3.Probando;
import com.example.tdaproyectofinalmodulo3.dao.DepartamentoDao;
import com.example.tdaproyectofinalmodulo3.model.Departamento;

@androidx.room.Database(entities = {Departamento.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public abstract DepartamentoDao departamentoDao();

    public static synchronized AppDatabase getInstance(Context context)
    {
        if(instance == null)
        {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class,"proyecto_db").build();
            Probando.baseDeDatosNueva = true;
        }
        else
        {
            Probando.baseDeDatosNueva = false;
        }
        return instance;
    }

    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(4);
}
