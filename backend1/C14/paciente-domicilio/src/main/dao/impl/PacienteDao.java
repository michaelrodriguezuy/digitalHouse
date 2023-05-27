package main.dao.impl;

import main.dao.AbstractDaoH2Latam;
import main.model.Domicilio;
import main.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class PacienteDao extends AbstractDaoH2Latam<Paciente> {

    public Logger logger = Logger.getLogger(PacienteDao.class);

    private final String TABLA = "paciente";
    private String SQL_INSERT = "INSERT INTO " + TABLA + "(id, nombre, id_domicilio) VALUES(?, ?, ?)";

    @Override
    public List<Paciente> findAll() {
        return null;
    }

    @Override
    public Paciente findById(Integer id) {
        Paciente resultado = null;

        //[1] Obtener y levantar el controlador
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + TABLA + " WHERE id = ?")){

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                resultado = new Paciente();

                resultado.setId(rs.getInt("id"));
                resultado.setNombre(rs.getString("nombre"));

                Domicilio domicilio = new Domicilio();
                domicilio.setId(rs.getInt("id_domicilio"));

                resultado.setDomicilio(domicilio);

            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }

        return resultado;
    }

    @Override
    public Paciente create(Paciente paciente) {
        Paciente resultado = null;

        //[1] Obtener y levantar el controlador
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)){

            stmt.setInt(1, paciente.getId());
            stmt.setString(2, paciente.getNombre());
            stmt.setInt(3, paciente.getDomicilio().getId());

            if(stmt.executeUpdate() == 1){
                resultado =  paciente;
            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }

        return resultado;
    }
}
