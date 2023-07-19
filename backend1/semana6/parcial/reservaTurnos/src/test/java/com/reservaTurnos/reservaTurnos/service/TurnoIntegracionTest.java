package com.reservaTurnos.reservaTurnos.service;


import com.reservaTurnos.reservaTurnos.entity.Odontologo;
import com.reservaTurnos.reservaTurnos.entity.Paciente;


import com.reservaTurnos.reservaTurnos.util.Jsons;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class TurnoIntegracionTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void crearPaciente() throws Exception {

        Paciente paciente = new Paciente();
        paciente.setNombre("Pedro");
        paciente.setApellido("Escobar");
        paciente.setDNI("1324564879");
        paciente.setFechaAlta(LocalDate.parse("2021-01-01"));

        MvcResult response = this.mvc.perform(MockMvcRequestBuilders.post("/pacientes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Jsons.asJsonString(paciente)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        Assert.assertFalse(response.getResponse().getContentAsString().isEmpty());
    }

    @Test
    public void crearOdontologo() throws Exception {

        Odontologo odontologo = new Odontologo();
        odontologo.setNombre("Pedro");
        odontologo.setApellido("Picapiedra");
        odontologo.setMatricula("1A324564879");

        MvcResult response = this.mvc.perform(MockMvcRequestBuilders.post("/odontologos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(Jsons.asJsonString(odontologo)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        Assert.assertFalse(response.getResponse().getContentAsString().isEmpty());
    }
}
