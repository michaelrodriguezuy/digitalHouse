package main.dao.impl;

import main.dao.AbstractDao;
import main.model.Medico;

import java.util.List;

public class DaoMedico extends AbstractDao<Medico> {
    public DaoMedico(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public List<Medico> findAll() {
        return null;
    }

    @Override
    public Medico findById(Integer id) {
        return null;
    }

    @Override
    public Medico create(Medico medico) {
        return null;
    }
}
