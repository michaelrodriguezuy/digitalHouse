package com.dh.facade.model;

import java.io.Serializable;

public class Producto implements Serializable {

    public long serialVersionUID = 1;

    private String nombre;
    private String tipo;

    public NoSerializable obj;

    public Producto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", obj=" + obj +
                '}';
    }
}
