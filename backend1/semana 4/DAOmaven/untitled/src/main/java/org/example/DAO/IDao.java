package org.example.DAO;

import java.util.List;

public interface IDao<E> {

    List<E> findAll();

    E findById(Integer id);

    E create(E e);



}
