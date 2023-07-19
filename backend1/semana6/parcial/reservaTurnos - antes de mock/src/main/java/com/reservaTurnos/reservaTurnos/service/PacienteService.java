package com.reservaTurnos.reservaTurnos.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reservaTurnos.reservaTurnos.dto.PacienteDTO;
import com.reservaTurnos.reservaTurnos.entity.Paciente;
import com.reservaTurnos.reservaTurnos.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregarPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public void modificarPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    private void guardarPaciente(PacienteDTO pacienteDTO){
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public Set<PacienteDTO> listarPacientes() {
        List<Paciente> pacientes= pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDto = new HashSet<>();

        for (Paciente paciente: pacientes){
            pacientesDto.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacientesDto;
    }

    @Override
    public PacienteDTO verPaciente(Long id) {

        Optional<Paciente> paciente= pacienteRepository.findById(id);
        PacienteDTO pacienteDTO=null;

        if (paciente.isPresent())
            pacienteDTO=mapper.convertValue(paciente, PacienteDTO.class);

        return pacienteDTO;
    }
}
