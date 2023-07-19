package com.reservaTurnos.reservaTurnos.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reservaTurnos.reservaTurnos.dto.OdontologoDTO;
import com.reservaTurnos.reservaTurnos.entity.Odontologo;
import com.reservaTurnos.reservaTurnos.repository.IOdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService{

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregarOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologo(odontologoDTO);
    }

    private void guardarOdontologo(OdontologoDTO odontologoDTO){
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);
    }

    @Override
    public Set<OdontologoDTO> listarOdontologos() {
        List<Odontologo> odontologos= odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();

        for (Odontologo odontologo: odontologos){
            odontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        return odontologosDTO;
    }

    @Override
    public OdontologoDTO verOdontologo(Long id) {
        Optional<Odontologo> odontologo= odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO=null;

        if (odontologo.isPresent())
            odontologoDTO=mapper.convertValue(odontologo, OdontologoDTO.class);

        return odontologoDTO;
    }
}
