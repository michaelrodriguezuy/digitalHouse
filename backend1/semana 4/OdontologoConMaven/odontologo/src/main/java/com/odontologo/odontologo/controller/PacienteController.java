package com.odontologo.odontologo.controller;

import com.odontologo.odontologo.models.Paciente;
import com.odontologo.odontologo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired //inyecta las dependencias -> manejar una clase desde otra clase
    public PacienteService pacienteService;

    @PostMapping("/registrar")
    public Paciente guardar(Paciente paciente){
        return pacienteService.savePaciente(paciente);
    }

    @GetMapping("/pacientes")
    public List<Paciente> getPaciente(){
        return pacienteService.listarPacientes();
    }

    @GetMapping("/{id}")
    public Paciente buscar(@PathVariable("id") Integer identificador){
        return pacienteService.buscarPacientePorID(identificador);
    }

    @GetMapping("/email")
    //con esto traigo un paciente por front
    public String pacientePorEmail(@RequestParam(name = "name", required = false, defaultValue = "email") String email, Model model) {
        Paciente pa = pacienteService.buscarPacientePorEmail(email);

        if (pa==null) return "El paciente no existe";

        model.addAttribute("name", pa.getNombre());
        model.addAttribute("surname", pa.getApellido());
        model.addAttribute("matricula", pa.getOdontologo().getMatricula());

        return "email";
    }


}
