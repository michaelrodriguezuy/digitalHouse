package main.dao;

import java.util.List;

public interface IDao<E> {

    List<E> findAll();

    E findById(Integer id);

    //Insert
    E create(E e);
    //Delete

    //Update
}
