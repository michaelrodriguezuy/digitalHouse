package com.dh.clinica.controller;

import com.dh.clinica.controller.exception.ResourceNotFoundException;
import com.dh.clinica.persistence.repository.entities.Odontologo;

import com.dh.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping()
    public ResponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo) {

        return ResponseEntity.ok(odontologoService.registrarOdontologo(odontologo));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscar(@PathVariable Integer id) {
        Odontologo odontologo = odontologoService.buscar(id).orElse(null);

        return ResponseEntity.ok(odontologo);
    }

    @PutMapping()
    public ResponseEntity<Odontologo> actualizar(@RequestBody Odontologo odontologo) {
        ResponseEntity<Odontologo> response = null;

        if (odontologo.getId() != null && odontologoService.buscar(odontologo.getId()).isPresent())
            response = ResponseEntity.ok(odontologoService.actualizar(odontologo));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) throws ResourceNotFoundException {
        odontologoService.eliminar(id);
        return ResponseEntity.ok("Todo bien, todo bien");
    }
    @GetMapping
    public ResponseEntity<List<Odontologo>> buscarTodos(){
        return ResponseEntity.ok(odontologoService.buscarTodos());
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> generalExceptionHandler(Exception ex){
        System.out.println("Ha ocurrido un error: " + ex.getMessage());
        return ResponseEntity.internalServerError().body("Ha ocurrido un error por favor intentar mas tarde");

    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
        System.out.println("Ha ocurrido un error: " + ex.getMessage() + ". Id del recurso: " + ex.getResourceId());
        //Invocar a la API de respaldo.
        return ResponseEntity.badRequest().body("Ha ocurrido un error por favor intente con un id válido");

    }
}
