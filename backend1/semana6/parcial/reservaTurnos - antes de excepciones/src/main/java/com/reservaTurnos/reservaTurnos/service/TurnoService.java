package com.reservaTurnos.reservaTurnos.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reservaTurnos.reservaTurnos.dto.TurnoDTO;
import com.reservaTurnos.reservaTurnos.entity.Turno;
import com.reservaTurnos.reservaTurnos.repository.ITurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregarTurno(TurnoDTO turnoDTO) {
        guardarTurno(turnoDTO);
    }

    @Override
    public void modificarTurno(TurnoDTO turnoDTO) {
        guardarTurno(turnoDTO);
    }

    private void guardarTurno(TurnoDTO turnoDTO){
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
    }

    @Override
    public void eliminarTurno(Long id) throws ResourceNotFoundException {
        if(turnoRepository.existsById(id)) {
            turnoRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("");
        }

    }

    @Override
    public Set<TurnoDTO> listarTurnos() {
        List<Turno> turnos= turnoRepository.findAll();
        Set<TurnoDTO> turnosDto = new HashSet<>();

        for (Turno turno: turnos){
            turnosDto.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return turnosDto;
    }

    @Override
    public TurnoDTO verTurno(Long id) {
        Optional<Turno> turno= turnoRepository.findById(id);
        TurnoDTO turnoDTO=null;

        if (turno.isPresent())
            turnoDTO=mapper.convertValue(turno, TurnoDTO.class);

        return turnoDTO;
    }
}
