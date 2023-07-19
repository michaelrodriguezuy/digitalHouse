package com.dh.clinica.service;

import com.dh.clinica.controller.exception.ResourceNotFoundException;
import com.dh.clinica.persistence.repository.entities.Odontologo;
import com.dh.clinica.persistence.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class OdontologoService {

    private final OdontologoRepository odontologoRepository;

    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);

    }

    public void eliminar(Integer id) throws ResourceNotFoundException {
        if(odontologoRepository.existsById(id)) {
            odontologoRepository.deleteById(id);
        }else{
            throw new ResourceNotFoundException("El odontólogo no se encuentra registrado en el sistema", id);
        }
    }

    public Optional<Odontologo> buscar(Integer id) {
        return odontologoRepository.findById(id);
    }

    public List<Odontologo> buscarTodos() {
        return odontologoRepository.findAll();
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }
}
