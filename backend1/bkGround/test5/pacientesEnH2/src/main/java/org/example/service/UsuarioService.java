package org.example.service;

import org.example.DAO.DAO;
import org.example.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public class UsuarioService {

    //ESTA CLASE DELEGA TODA LA RESPONSABILIDAD DE GUARDA, ELIMINAR Y BUSCAR AL DAO

    private DAO<Usuario> usuarioDao;

    public DAO<Usuario> getUsuarioDao(){
        return usuarioDao;
    }

    public void setUsuarioDao(DAO<Usuario> usuarioDao){
        this.usuarioDao=usuarioDao;
    }

    public Usuario guardarUsuario(Usuario u) throws SQLException {
        return usuarioDao.guardar(u);
    }

    public void eliminarUsuario (Long id) throws SQLException {
        usuarioDao.eliminar(id);
    }

    public Usuario buscarUsuario(Long id) throws SQLException {
        return usuarioDao.buscar(id);
    }

    public List<Usuario> buscarTodos() throws SQLException {
        return usuarioDao.buscarTodos();
    }

    public void modificar(String email) throws SQLException {
        usuarioDao.modificar(email);
    }
}
