package com.reservaTurnos.reservaTurnos.service;

import com.reservaTurnos.reservaTurnos.dto.PacienteDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private IPacienteService pacienteService;

    @Test
    public void testCrearPaciente (){
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNombre("Manolo");
        pacienteDTO.setApellido("Galvan");
        pacienteDTO.setDNI("1324564879");
        pacienteService.agregarPaciente(pacienteDTO);

        PacienteDTO pacienteNew = pacienteService.verPaciente(2L);

        Assertions.assertTrue(pacienteNew != null);
    }

}