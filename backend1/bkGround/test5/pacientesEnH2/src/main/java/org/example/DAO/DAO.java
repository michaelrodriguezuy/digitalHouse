package org.example.DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T>{
    public T guardar(T t) throws SQLException;
    public void eliminar(Long id) throws SQLException;
    public void modificar(String email) throws SQLException;
    public T buscar(Long id) throws SQLException;
    public List<T> buscarTodos() throws SQLException;
}
