package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FiltroDePersonasTest {

    @Test
    public void daberíaFiltrarCorrectamentePorNombre(){
        //DADOS
        int edadApta = 19;
        Persona persona1 = new Persona("Juan", edadApta);
        Persona persona2 = new Persona("Pedro", edadApta);
        Persona persona3 = new Persona("Ana", edadApta);
        Persona persona4 = new Persona("Luz", edadApta);
        Persona persona5 = new Persona("Julián", edadApta);

        FiltroDePersonas sujetoDePrueba = new FiltroDePersonas();

        //CUANDO
        List<Persona> resultado = sujetoDePrueba.filtrar(List.of(persona1, persona2, persona3, persona4, persona5));

        //ENTONCES
        Assertions.assertTrue(resultado.size() == 2);

    }

    @Test
    public void daberíaFiltrarCorrectamentePorNombre2(){
        //DADOS
        String nombreLargo = "NOMBRE_LARGO";
        Persona persona1 = new Persona(nombreLargo, 18);
        Persona persona2 = new Persona(nombreLargo, 17);
        Persona persona3 = new Persona(nombreLargo, 22);
        Persona persona4 = new Persona(nombreLargo, 14);
        Persona persona5 = new Persona(nombreLargo, 32);

        FiltroDePersonas sujetoDePrueba = new FiltroDePersonas();

        //CUANDO
        List<Persona> resultado = sujetoDePrueba.filtrar(List.of(persona1, persona2, persona3, persona4, persona5));

        //ENTONCES
        Assertions.assertTrue(resultado.size() == 2);
    }
}