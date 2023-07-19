package org.example.DAO.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.core.config.Property;
import org.example.DAO.AbsctractDao;
import org.example.model.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.List;
import java.util.Properties;


public class DaoEmpleado extends AbsctractDao<Empleado> {

    private static final Logger logger = LogManager.getLogger(DaoEmpleado.class);
   // Properties properties = new Properties();

    private final String TABLA = "empleado";
    private final String SQL_INSERT = "INSERT INTO " + TABLA +
            "(idEmpleado, nombre, apellido, edad, ciudad) VALUES(?, ?, ?, ?, ?)";

    //este constructor vacio lo uso para instanciar al logger
/*
    public DaoEmpleado(){
        super("","","");
    }
 */

    public DaoEmpleado(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Empleado findById(Integer id) {
        return null;
    }

    @Override
    public Empleado create(Empleado emp) {
        Empleado resultado = null;
        /*
        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password)) {
            System.out.println("conexion valida ?"+conn.isValid(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

        logger.debug("DEBUG");
            logger.info("INFO");
        logger.error("ERROR");
        logger.warn("WARN");
        logger.fatal("FATAL");
 /*
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);

            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)){

            //properties.load(new FileInputStream(LOG_FILE));


            stmt.setInt(1, emp.getIdEmpleado());
            stmt.setString(2, emp.getNombre());
            stmt.setString(3, emp.getApellido());
            stmt.setInt(4, emp.getEdad());
            stmt.setString(5, emp.getCiudad());

            if(stmt.executeUpdate() == 1){
                logger.info("mostramos el objeto guardado en base");
                resultado =  emp;
            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage()); //al querer insertar un Empleado con ID repetido este tiene que tirar un mensaje

        }/* catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //logger.warn("esto es un warning");
        logger.fatal("esto es una fatalidad");
        return resultado;
    }
}
