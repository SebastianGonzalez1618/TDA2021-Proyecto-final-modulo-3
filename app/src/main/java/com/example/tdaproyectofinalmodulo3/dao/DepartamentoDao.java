package com.example.tdaproyectofinalmodulo3.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.tdaproyectofinalmodulo3.model.Departamento;

import java.util.List;

@Dao
public interface DepartamentoDao {



    @Insert
    void agregar(Departamento depa);

    @Delete
    void eliminar(Departamento depa);

    @Update
    void actualizar(Departamento depa);

    @Query("SELECT" +
            "   id_departamento" +
            ", nombre_proyecto" +
            ", direccion_proyecto" +
            ", departamento" +
            ", imagen_proyecto" +
            ", luces" +
            ", elementos_banio" +
            ", elementos_cocina" +
            ", elementos_dormitorio" +
            ", estado_general" +
            ", puntaje_total " +
            "FROM departamento;")
    LiveData<List<Departamento>> listar();

    @Query("SELECT " +
            "  id_departamento" +
            ", nombre_proyecto" +
            ", direccion_proyecto" +
            ", departamento" +
            ", imagen_proyecto" +
            ", luces" +
            ", elementos_banio" +
            ", elementos_cocina" +
            ", elementos_dormitorio" +
            ", estado_general" +
            ", puntaje_total " +
            "FROM departamento " +
            "WHERE id_departamento = :id")
    LiveData<Departamento> buscar(int id);
}
