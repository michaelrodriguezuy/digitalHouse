package test.service;

import main.model.Odontologo;
import main.service.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.testing.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

        @Test
        public void confirmarCreacionDeUnPacienteEnH2() {

            //DADO
            OdontologoService test = new OdontologoService();
            Odontologo o = new Odontologo();

            o.setNombre("Pepe");
            o.setApellido("Argento");
            o.setNumero_matricula(3);

            //CUANDO

            Boolean resultado = test.crearOdontologoH2(o);

            //ENTONCES

            Assertions.assertTrue(resultado);


        }

        @Test
        public void confirmarCreacionDeUnPacienteEnMemoria() {

            //DADO
            OdontologoService test = new OdontologoService();
            Odontologo o = new Odontologo();

            o.setNumero_matricula(4);
            o.setNombre("Machadito");
            o.setApellido("Rodriguez");

            //CUANDO
            Boolean resultado = test.crearOdontologoMemoria(o);

            //ENTONCES

            Assertions.assertTrue(resultado);


        }

        @Test
        public void deberiaHaberDistintaCantidadDeRegistrosEnH2YMemoria() {

            //DADO

            Odontologo o = new Odontologo();

            o.setNombre("Raul");
            o.setApellido("Perez");
            o.setNumero_matricula(5);

            OdontologoService test = new OdontologoService();
            test.crearOdontologoMemoria(o);

            System.out.println("Odontologos en H2: "+test.consultarOdontologosH2().size());
            System.out.println("Odontologos en memoria: "+test.consultarOdontologosMemoria().size());
            Assertions.assertNotEquals(test.consultarOdontologosH2().size(), test.consultarOdontologosMemoria().size());

        }

        @Test
        public void deberiaRetornarFalsoAlCrearOdontologoConMatriculaQueYaExiste() {

            //DADO

            OdontologoService test = new OdontologoService();

            Odontologo o = new Odontologo();

            o.setNombre("Juan");
            o.setApellido("Rodriguez");
            o.setNumero_matricula(2);

            //CUANDO
            Boolean resultado = test.crearOdontologoH2(o);

            //Entonces
            Assertions.assertFalse(resultado);

        }

        @Test
        public void deberiaRetornarUnaListaDeOdontologos() {

            //DADO

            OdontologoService test = new OdontologoService();

            //CUANDO
            List<Odontologo> odontologos = test.consultarOdontologosH2();

            //ENTONCES

            int index = 0;
            while(index < odontologos.size()) {

                Assertions.assertNotNull(odontologos.get(index).getNumero_matricula());
                Assertions.assertNotNull(odontologos.get(index).getNombre());
                Assertions.assertNotNull(odontologos.get(index).getApellido());


                index++;
            }

        }

}