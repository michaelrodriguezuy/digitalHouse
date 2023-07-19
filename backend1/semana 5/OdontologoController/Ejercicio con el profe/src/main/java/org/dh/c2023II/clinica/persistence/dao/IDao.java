package org.dh.c2023II.clinica.persistence.dao;

import org.dh.c2023II.clinica.model.Paciente;

import java.util.List;

public interface IDao<E> {

    List<E> findAll();

    E findById(Integer id);

    //Insert
    E save(E e);
    //Delete
    
    List<E> delete(Integer id);
    
    //Update
}
