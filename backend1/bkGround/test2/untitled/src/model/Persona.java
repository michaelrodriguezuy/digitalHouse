package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {

    private String nombre, apellido, email;
    private LocalDate edad;

    public Persona(String nombre, String apellido, String email, LocalDate edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public String devuelveApellidoNombre() {
        return this.getApellido()  + ", " + this.getNombre();
    }


    public boolean esMayorEdad(LocalDate unaFecha){
        boolean esMayor = false;
        if (ChronoUnit.YEARS.between(this.getEdad(), unaFecha)>18 ) {
            esMayor=true;
        }

        return esMayor;
    }


}
