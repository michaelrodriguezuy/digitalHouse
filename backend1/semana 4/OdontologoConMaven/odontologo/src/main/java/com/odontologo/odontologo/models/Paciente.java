package com.odontologo.odontologo.models;

import java.time.LocalDate;

public class Paciente {
    private Long id;
    private String apellido;
    private String nombre;
    private String email;
    private LocalDate fechaIngreso;
    private String dni;
    private Odontologo odontologo;

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Paciente(Long id, String apellido, String nombre, String email, LocalDate fechaIngreso, String dni, Odontologo odontologo) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.fechaIngreso = fechaIngreso;
        this.dni = dni;
        this.odontologo = odontologo;
    }

    public Paciente(Long id, String apellido, String nombre, String email, LocalDate fechaIngreso, String dni) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.fechaIngreso = fechaIngreso;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", dni='" + dni + '\'' +
                '}';
    }
}
