package com.reservaTurnos.reservaTurnos.service;

import com.reservaTurnos.reservaTurnos.dto.TurnoDTO;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.util.Set;

public interface ITurnoService {

    void agregarTurno(TurnoDTO turnoDTO);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Long id) throws ResourceNotFoundException;
    Set<TurnoDTO> listarTurnos();

    TurnoDTO verTurno(Long id);
}
