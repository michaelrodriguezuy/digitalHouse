package com.reservaTurnos.reservaTurnos.controller;

import com.reservaTurnos.reservaTurnos.dto.OdontologoDTO;
import com.reservaTurnos.reservaTurnos.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    OdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<?> agregarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.agregarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public OdontologoDTO verOdontologo(@PathVariable Long id){
        return odontologoService.verOdontologo(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<OdontologoDTO> listarOdontologos() {
        return odontologoService.listarOdontologos();
    }
}
