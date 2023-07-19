package org.dh.c2023II.clinica.persistence.dao.impl;

import org.dh.c2023II.clinica.model.Odontologo;
import org.dh.c2023II.clinica.persistence.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDao implements IDao<Odontologo> {

    List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoDao() {
        odontologos.add(new Odontologo(1, "123456", "Manuel Piringo"));
        odontologos.add(new Odontologo(2, "123457", "Raul Rockefeler"));
        odontologos.add(new Odontologo(3, "123458", "Monica Meyer"));
    }

    @Override
    public List<Odontologo> findAll() {
        return this.odontologos;
    }

    @Override
    public Odontologo findById(Integer id) {
        return odontologos.stream().filter(o -> o.getId() == (id)).findFirst().orElse(null)  ;
    }
    
    @Override
    public Odontologo save(Odontologo odontologo) {
        this.odontologos.add(odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> delete(Integer id) {
        odontologos.removeIf(o -> o.getId() == id);
        // this.odontologos.remove(findById(id));
        return odontologos;
    }
}
