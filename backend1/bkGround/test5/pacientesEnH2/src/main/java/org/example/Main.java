package org.example;

import org.example.DAO.UsuarioDAO;
import org.example.model.Usuario;
import org.example.service.UsuarioService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE;

public class Main {

    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            + "("
            + "ID BIGINT PRIMARY KEY, "
            + "NOMBRE VARCHAR(100) NOT NULL,"
            + "EMAIL VARCHAR (100) NOT NULL,"
            + "SUELDO NUMERIC(15,2) NOT NULL"
            + ");";

    public static void main(String[] args) throws Exception{

        Connection con = null;
        con = UsuarioDAO.getConnection();
        Statement statement = con.createStatement();
        statement.execute(SQL_TABLE_CREATE);


        Usuario usuario = new Usuario("Machadito", "mAchadito@gmail.com", 15500.0);
        usuario.setId(1L);

        Usuario usuario2 = new Usuario("Gonzalo", "pedada@gmail.com", 30000.0);
        usuario2.setId(2L);

        Usuario usuario3 = new Usuario("Enrique", "dsad45dasda@gmail.com", 22500.0);
        usuario3.setId(3L);

        UsuarioService userSer = new UsuarioService(); //
        userSer.setUsuarioDao(new UsuarioDAO()); // aca le seteamos el DAO, la estrategia de persistencia, esto lo va a guardar en un DAO H2

        userSer.guardarUsuario(usuario);
        userSer.guardarUsuario(usuario2);
        userSer.guardarUsuario(usuario3);

        System.out.println("ID\tNOMBRE\tEMAIL\t\t\t\t\tSUELDO\t");
        userSer.buscarTodos();
        System.out.println("");
        System.out.println("**busqueda de un usuario**");
        System.out.println("ID\tNOMBRE\tEMAIL\t\t\t\t\tSUELDO\t");
        userSer.buscarUsuario(usuario2.getId()).toString();

        userSer.eliminarUsuario(usuario2.getId());
        System.out.println("");
        System.out.println("**se elimino el usuario Gonzalo**");
        userSer.buscarTodos();

        System.out.println("");
        System.out.println("**al usuario Enrique le subo el sueldo**");
        userSer.modificar(usuario3.getEmail());
        userSer.buscarTodos();
    }
}