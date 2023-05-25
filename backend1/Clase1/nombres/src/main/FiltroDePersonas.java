package main;

import java.util.ArrayList;
import java.util.List;

public class FiltroDePersonas {

    public List<Persona> filtrar(List<Persona> personas){
        List<Persona> resultado = new ArrayList<>();

        for (Persona p : personas){
            if(p.getNombre().length() >= 5 && p.getEdad() > 18){
                resultado.add(p);
            }
        }

        return resultado;
    }
}
