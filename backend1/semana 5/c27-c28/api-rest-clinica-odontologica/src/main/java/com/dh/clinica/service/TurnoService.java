package com.dh.clinica.service;

import com.dh.clinica.persistence.dao.IDao;
import com.dh.clinica.model.Turno;
import com.dh.clinica.persistence.dao.impl.TurnoListDao;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class TurnoService {

    private IDao<Turno> turnoRepository;

    public TurnoService(TurnoListDao turnoListDao) {
    }

    public TurnoService(IDao<Turno> turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    public Turno registrarTurno(Turno turno){
        Turno respuesta = null;
        if(turno.getDate().isBefore(LocalDate.now())){
            respuesta = turnoRepository.guardar(turno);
        }

        return respuesta;
    }
    public List<Turno> listar(){
        return turnoRepository.buscarTodos();
    }
    public void eliminar(Integer id){
        turnoRepository.eliminar(id);
    }
    public Turno actualizar(Turno turno){
        return turnoRepository.actualizar(turno);
    }
    public Optional<Turno> buscar(Integer id){
        return turnoRepository.buscar(id);
    }

}
