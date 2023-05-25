package test.service;

import main.model.Domicilio;
import main.model.Paciente;
import main.service.PacienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {

    @Test
    public void deberiaRetornarUnPacienteConLaInformacionBasica(){
        //DADO
        PacienteService sujetoDePrueba = new PacienteService();
        Integer idABuscar = 1;

        //CUANDO
        Paciente resultado = sujetoDePrueba.consultarInformacionBasicaDelPaciente(idABuscar);

        //ENTONCES
        Assertions.assertNotNull(resultado);
        Assertions.assertNotNull(resultado.getDomicilio().getId());
        Assertions.assertNull(resultado.getDomicilio().getCalle());
        Assertions.assertNull(resultado.getDomicilio().getNumero());
    }

    @Test
    public void deberiaRetornarNullCuandoSePidaLaInfoBasicaDeUnPacienteQueNoExiste(){
        //DADO
        PacienteService sujetoDePrueba = new PacienteService();
        Integer idABuscar = 3;

        //CUANDO
        Paciente resultado = sujetoDePrueba.consultarInformacionBasicaDelPaciente(idABuscar);

        //ENTONCES
        Assertions.assertNull(resultado);
    }

    @Test
    public void deberiaRetornarUnPacienteConLaInformacionCompleta(){
        //DADO
        PacienteService sujetoDePrueba = new PacienteService();
        Integer idABuscar = 1;

        //CUANDO
        Paciente resultado = sujetoDePrueba.consultarInformacionCompletaDelPaciente(idABuscar);

        //ENTONCES
        Assertions.assertNotNull(resultado);
        Assertions.assertNotNull(resultado.getDomicilio().getId());
        Assertions.assertNotNull(resultado.getDomicilio().getCalle());
        Assertions.assertNotNull(resultado.getDomicilio().getNumero());
    }

    @Test
    public void deberiaRetornarTrueAlCrearUnPacienteCorrectamente(){
        //DADO
        PacienteService sujetoDePrueba = new PacienteService();
        Paciente p = new Paciente();
        Domicilio d = new Domicilio();

        d.setId(2);
        d.setCalle("NQS");
        d.setNumero("30");

        p.setId(2);
        p.setNombre("Yuma");
        p.setDomicilio(d);

        //CUANDO
        Boolean resultado = sujetoDePrueba.crearNuevoPaciente(p);

        //ENTONCES
        Assertions.assertTrue(resultado);
    }

    @Test
    public void deberiaRetornarFalseAlCrearUnPacienteCuyoIdYaExiste(){
        //DADO
        PacienteService sujetoDePrueba = new PacienteService();
        Paciente p = new Paciente();
        Domicilio d = new Domicilio();

        d.setId(2);
        d.setCalle("NQS");
        d.setNumero("30");

        p.setId(1);
        p.setNombre("Yuma");
        p.setDomicilio(d);

        //CUANDO
        Boolean resultado = sujetoDePrueba.crearNuevoPaciente(p);

        //ENTONCES
        Assertions.assertFalse(resultado);
    }
}