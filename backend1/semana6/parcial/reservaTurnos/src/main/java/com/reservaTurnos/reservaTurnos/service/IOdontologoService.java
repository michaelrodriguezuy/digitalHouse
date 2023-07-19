package com.reservaTurnos.reservaTurnos.service;



import com.reservaTurnos.reservaTurnos.dto.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    void agregarOdontologo(OdontologoDTO odontologoDTO);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Long id);
    Set<OdontologoDTO> listarOdontologos();

    OdontologoDTO verOdontologo(Long id);

}
