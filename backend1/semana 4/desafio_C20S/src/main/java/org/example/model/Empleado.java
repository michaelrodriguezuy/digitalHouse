package org.example.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;

public class Empleado implements Serializable {

    public Logger logger = LogManager.getLogger(Empresa.class);
    private String nombre, apellido, puesto;
    private double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String apellido, String puesto, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }


}
