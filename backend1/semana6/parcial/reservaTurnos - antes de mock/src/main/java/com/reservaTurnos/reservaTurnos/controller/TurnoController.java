package com.reservaTurnos.reservaTurnos.controller;


import com.reservaTurnos.reservaTurnos.dto.TurnoDTO;
import com.reservaTurnos.reservaTurnos.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    TurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> agregarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.agregarTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO verTurno(@PathVariable Long id){
        return turnoService.verTurno(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.modificarTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Long id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<TurnoDTO> listarTurnos() {
        return turnoService.listarTurnos();
    }
}
