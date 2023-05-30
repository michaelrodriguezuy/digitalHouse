package main.dao.impl;


import main.dao.IDao;
import main.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class DaoOdontologoMemoria implements IDao<Odontologo> {

    private List<Odontologo> odontologos;

    public DaoOdontologoMemoria(List<Odontologo> odontologos) {
        this.odontologos = odontologos;
    }

    @Override
    public List<Odontologo> findAll() {
        return this.odontologos;
    }

    @Override
    public Odontologo findById(Integer id) {
        return null;
    }

    @Override
    public Odontologo create(Odontologo odontologo) {

        for (Odontologo o : odontologos) {

            if(o.getNumero_matricula() == odontologo.getNumero_matricula()) {

                return null;
            }

        }

        this.odontologos.add(odontologo);
        return odontologo;


    }
}
