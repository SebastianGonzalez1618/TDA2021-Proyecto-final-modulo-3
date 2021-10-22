package com.example.tdaproyectofinalmodulo3.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "departamento")
public class Departamento {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_departamento")
    private int idDepartamento;
    @ColumnInfo(name = "nombre_proyecto")
    private String nombreProyecto;
    @ColumnInfo(name = "direccion_proyecto")
    private String direccionProyecto;
    @ColumnInfo(name = "departamento")
    private String departamento;
    @ColumnInfo(name = "imagen_proyecto")
    private String imagenProyecto;
    @ColumnInfo(name = "luces")
    private boolean luces;
    @ColumnInfo(name = "elementos_banio")
    private boolean elementosBanio;
    @ColumnInfo(name = "elementos_cocina")
    private boolean elementosCocina;
    @ColumnInfo(name = "elementos_dormitorio")
    private boolean elementosDormitorio;
    @ColumnInfo(name = "estado_general")
    private String estadoGeneral;
    @ColumnInfo(name = "puntaje_total")
    private int puntajeTotal;

    public Departamento(int idDepartamento, String nombreProyecto, String direccionProyecto, String departamento, String imagenProyecto, boolean luces, boolean elementosBanio, boolean elementosCocina, boolean elementosDormitorio, String estadoGeneral, int puntajeTotal) {
        this.idDepartamento = idDepartamento;
        this.nombreProyecto = nombreProyecto;
        this.direccionProyecto = direccionProyecto;
        this.departamento = departamento;
        this.imagenProyecto = imagenProyecto;
        this.luces = luces;
        this.elementosBanio = elementosBanio;
        this.elementosCocina = elementosCocina;
        this.elementosDormitorio = elementosDormitorio;
        this.estadoGeneral = estadoGeneral;
        this.puntajeTotal = puntajeTotal;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDireccionProyecto() {
        return direccionProyecto;
    }

    public void setDireccionProyecto(String direccionProyecto) {
        this.direccionProyecto = direccionProyecto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getImagenProyecto() {
        return imagenProyecto;
    }

    public void setImagenProyecto(String imagenProyecto) {
        this.imagenProyecto = imagenProyecto;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public boolean isElementosBanio() {
        return elementosBanio;
    }

    public void setElementosBanio(boolean elementosBanio) {
        this.elementosBanio = elementosBanio;
    }

    public boolean isElementosCocina() {
        return elementosCocina;
    }

    public void setElementosCocina(boolean elementosCocina) {
        this.elementosCocina = elementosCocina;
    }

    public boolean isElementosDormitorio() {
        return elementosDormitorio;
    }

    public void setElementosDormitorio(boolean elementosDormitorio) {
        this.elementosDormitorio = elementosDormitorio;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }
}
