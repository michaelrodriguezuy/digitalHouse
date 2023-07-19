package com.odontologo.odontologo.service;

import com.odontologo.odontologo.models.Odontologo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService {

    private List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoService() {
        odontologos.add(new Odontologo(1,"Pedro","Escobar", 1234L));
        odontologos.add(new Odontologo(2,"Raul","Perez", 5678L));
    }

    public List<Odontologo> listarOdontologos(){
        return odontologos;
    }

    public Odontologo buscarOdontologoPorID(Long id) {
        return odontologos.stream().filter(odontologo -> odontologo.getId() == (id)).findFirst().orElse(null);
                //.findFirst()
                //.orElse(null)
    }


}
