package main.dao.impl;

import main.dao.AbsctractDao;
import main.model.Odontologo;
import org.apache.log4j.Logger;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoOdontologo extends AbsctractDao<Odontologo> {


    public Logger logger = Logger.getLogger(DaoOdontologo.class);
    private final String TABLA = "odontologo";

    private final String SQL_INSERT = "INSERT INTO " + TABLA + "(numero_matricula, nombre, apellido) VALUES(?, ?, ?)";


    public DaoOdontologo(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public List<Odontologo> findAll() {
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
             Statement stmt = conn.createStatement()){

            ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABLA);

            while(rs.next()) {
                Odontologo o = new Odontologo();

                o.setNumero_matricula(rs.getInt("numero_matricula"));
                o.setNombre(rs.getString("nombre"));
                o.setApellido(rs.getString("apellido"));

                odontologos.add(o);

            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }




        return odontologos;
    }

    @Override
    public Odontologo findById(Integer id) {

        Odontologo resultado = null;

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + TABLA + " WHERE id = ?")){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                resultado = new Odontologo();

                resultado.setNumero_matricula(rs.getInt("numero_matricula"));
                resultado.setNombre(rs.getString("nombre"));
                resultado.setApellido(rs.getString("apellido"));

            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }




        return resultado;
    }

    @Override
    public Odontologo create(Odontologo odontologo) {

        Odontologo resultado = null;

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)){

            stmt.setInt(1, odontologo.getNumero_matricula());
            stmt.setString(2, odontologo.getNombre());
            stmt.setString(3, odontologo.getApellido());

            if(stmt.executeUpdate() == 1){
                resultado =  odontologo;
            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }



        return resultado;
    }
}
