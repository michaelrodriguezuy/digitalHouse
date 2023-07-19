package org.dh.c2023II.clinica.service;

import org.dh.c2023II.clinica.model.Odontologo;
import org.dh.c2023II.clinica.model.Paciente;
import org.dh.c2023II.clinica.persistence.dao.IDao;
import org.dh.c2023II.clinica.persistence.dao.impl.OdontologoDao;
import org.dh.c2023II.clinica.persistence.dao.impl.PacienteDao;

import java.util.List;

public class PacienteService {

    IDao<Paciente> pdao = new PacienteDao();


    public List<Paciente> listarTodos() {
        return pdao.findAll();
    }

    public Paciente crear(Paciente p) {
        if(p.getNombre() != null && !p.getNombre().isBlank()){
            return pdao.save(p);
        }

        return null;
    }

    public Paciente modificar(Paciente p) {
        if(p.getId() != null){
            if(pdao.findById(p.getId()) != null){
                //TODO: agrear los cambios
            }
        }

        return null;
    }

    public Paciente buscarPorId(Integer id) {
        return pdao.findById(id);
    }
}
