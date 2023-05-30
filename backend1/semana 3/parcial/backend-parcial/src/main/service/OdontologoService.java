package main.service;

import main.dao.IDao;
import main.dao.impl.DaoOdontologo;
import main.dao.impl.DaoOdontologoMemoria;
import main.model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoService {

    IDao<Odontologo> odontologoDao = new DaoOdontologo("jdbc:h2:D:\\backend\\librerias\\h2\\bin;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
    IDao<Odontologo> odontologoDaoMemoria = new DaoOdontologoMemoria(odontologoDao.findAll());


    public List<Odontologo> consultarOdontologosH2() {

        List<Odontologo> odontologos = new ArrayList<>();

        odontologos = odontologoDao.findAll();

        return odontologos;

    }

    public List<Odontologo> consultarOdontologosMemoria() {

        return odontologoDaoMemoria.findAll();

    }

    public boolean crearOdontologoMemoria(Odontologo o) {

        if(odontologoDaoMemoria.create(o) == null){
            return false;
        }

        return true;

    }



    public boolean crearOdontologoH2(Odontologo o) {

        if(odontologoDao.create(o) != null){
            return true;
        }

        return false;

    }


}
