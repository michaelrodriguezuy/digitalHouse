import static org.junit.jupiter.api.Assertions.*;

import model.Persona;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

public class PersonaTest {

    LocalDate fechaActual= LocalDate.parse("2021-09-21");

    @Test
    public void nombreCompleto(){
        Persona persona1 = new Persona("Pedro", "Picapiedra", "pedro@picapiedra.com",LocalDate.of(2003,05,21));
        Persona persona2 = new Persona("Paolo", "Montero", "pincha@rata.com",LocalDate.of(1980,05,18));

        String nombreCompleto1 = persona1.devuelveApellidoNombre();
        String nombreCompleto2 = persona2.devuelveApellidoNombre();

        boolean esMayor1 = persona1.esMayorEdad(fechaActual);
        boolean esMayor2 = persona2.esMayorEdad(fechaActual);

        /*
        assertEquals("Picapiedra, Pedro", nombreCompleto1); //true
        assertEquals("Picapiedra, Pedro", nombreCompleto2); //false
        */

        assertFalse(esMayor1);
        //assertFalse(esMayor2);


    }
}
