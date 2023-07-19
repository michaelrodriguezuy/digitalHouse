package org.dh.c2023II.clinica.controller;

import org.apache.log4j.Logger;
import org.dh.c2023II.clinica.model.Paciente;
import org.dh.c2023II.clinica.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController implements IController<Paciente>{

    Logger logger = Logger.getLogger(PacienteController.class);

    PacienteService pservice = new PacienteService();

    @Override
    @GetMapping("/pacientes")
    public List<Paciente> listarTodos() {
        return pservice.listarTodos();

    }

    @GetMapping("/pacientes/{id}")
    public Paciente listarOdontologoPorId(@PathVariable Integer id) {
        return pservice.buscarPorId(id);
    }

    @PostMapping
    public Paciente crear(@RequestBody Paciente p){
        return pservice.crear(p);
    }

    @PutMapping
    public Paciente modificar(@RequestBody Paciente p){
        return pservice.modificar(p);
    }

    // localhost:8080/5/123 <-- url
    @GetMapping("{id}/{docIdentidad}")
    public Paciente buscarPorId(@PathVariable Integer id){
        //TODO: implementar

        	return null;

    }

    // Request param es un key-value arg (query param)
    // localhost:8080?docIdentidad=123&id=5 <-- url
    @GetMapping
    public Paciente buscarPorIdRequestParam(@RequestParam Integer id, @RequestParam Integer docIdentidad) {
    
    
        return null;
    }
    
    
    
}
