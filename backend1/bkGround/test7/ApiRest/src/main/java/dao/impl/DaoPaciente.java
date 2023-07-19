package dao.impl;

import dao.AbstractDao;
import model.Paciente;



import java.util.List;

public class DaoPaciente extends AbstractDao<Paciente> {
    public DaoPaciente(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public List<Paciente> findAll() {
        return null;
    }

    @Override
    public Paciente findById(Integer id) {
        return null;
    }

    @Override
    public Paciente create(Paciente paciente) {
        return null;
    }
}
