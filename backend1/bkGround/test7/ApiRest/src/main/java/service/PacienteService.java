package service;

import dao.IDao;
import dao.impl.DaoDomicilio;
import dao.impl.PacienteDao;

import model.Domicilio;
import model.Paciente;

public class PacienteService {
    IDao<Paciente> pacienteDao = new PacienteDao();
    IDao<Domicilio> domicilioDao = new DaoDomicilio("jdbc:h2:~/db_clinica_20231;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");


    public Paciente consultarInformacionCompletaDelPaciente(Integer id){
        Paciente paciente = null;


        paciente = pacienteDao.findById(id);
        Domicilio d = domicilioDao.findById(paciente.getDomicilio().getId());

        paciente.setDomicilio(d);

        return paciente;
    }

    public Paciente consultarInformacionBasicaDelPaciente(Integer id){
        Paciente paciente = null;

        if(esUnIdValido(id)) {
            paciente = pacienteDao.findById(id);
        }

        return paciente;
    }

    public boolean crearNuevoPaciente(Paciente p){
        if(pacienteDao.create(p) != null){
            domicilioDao.create(p.getDomicilio());
            return true;
        }

        return false;
    }

    private boolean esUnIdValido(Integer id){
        return id != null && id > 0;
    }
}
