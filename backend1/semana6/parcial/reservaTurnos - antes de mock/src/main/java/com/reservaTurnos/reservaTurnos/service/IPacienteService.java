package com.reservaTurnos.reservaTurnos.service;

import com.reservaTurnos.reservaTurnos.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    void agregarPaciente(PacienteDTO pacienteDTO);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Long id);
    Set<PacienteDTO> listarPacientes();

    PacienteDTO verPaciente(Long id);

}
