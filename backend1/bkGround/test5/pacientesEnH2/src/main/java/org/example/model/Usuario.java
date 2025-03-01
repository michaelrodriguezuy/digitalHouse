package org.example.model;

public class Usuario {

    private String nombre;
    private Long id; //el id va a ser creado cuando lo insertemos en la base de datos
    private String email;
    private double sueldo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double subirSueldo (double precio) {
        this.sueldo= this.sueldo + precio;
                return this.sueldo;
    }

    public Usuario(String nombre, String email, double sueldo) {
        this.nombre = nombre;
        this.email = email;
        this.sueldo = sueldo;
    }

    public Usuario(){

    }

    @Override
    public String toString() {
        return "Usuario{" +
                ", id=" + id +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
