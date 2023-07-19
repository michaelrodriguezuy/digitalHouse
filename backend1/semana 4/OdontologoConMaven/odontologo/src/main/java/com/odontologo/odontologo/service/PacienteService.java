package com.odontologo.odontologo.service;

import com.odontologo.odontologo.models.Odontologo;
import com.odontologo.odontologo.models.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private OdontologoService oS = new OdontologoService();
    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteService() {

        pacientes.add(new Paciente("pedrozo", "juan","juan@juan.com", LocalDate.of(2022,10,15),"4545-454", oS.buscarOdontologoPorID(2L) ));
        pacientes.add(new Paciente("ventancur", "ezequiel","pablo@pedro.com", LocalDate.of(2021,07,15),"4545-454", oS.buscarOdontologoPorID(1L) ));
        pacientes.add(new Paciente("ventancur", "ezequiel","automotora@coca.com", LocalDate.of(2021,07,15),"4545-454", oS.buscarOdontologoPorID(2L) ));
    }

    public List<Paciente> listarPacientes(){
        return pacientes;
    }

    public Paciente buscarPacientePorID(int id) {
        return pacientes.stream().filter(paciente -> paciente.getId() == (id)).findFirst().orElse(null);
        //.findFirst()
        //.orElse(null)
    }
    public Paciente buscarPacientePorEmail(String email) {

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getEmail().equals(email)) {
                return pacientes.get(i);
            }
        }
        return null;
        
       // return pacientes.stream().filter(paciente -> paciente.getEmail().equals(email)).findFirst().orElse(null);
    }

    public Paciente savePaciente(Paciente p){
         pacientes.add(p);
        return p;
    }
}
