package dao.impl;

import dao.AbstractDao;
import dao.AbstractDaoH2Latam;
import model.Domicilio;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//import java.util.logging.Logger;

public class DaoDomicilio extends AbstractDao<Domicilio> {

    private final String TABLA = "domicilio";
    private String SQL_INSERT = "INSERT INTO " + TABLA + "(id, calle, numero) VALUES(?, ?, ?)";

    public Logger logger = Logger.getLogger(DaoDomicilio.class);

    public DaoDomicilio(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public List<Domicilio> findAll() {
        return null;
    }

    @Override
    public Domicilio findById(Integer id) {
        Domicilio resultado = null;

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
                resultado = new Domicilio();

                resultado.setId(rs.getInt("id"));
                resultado.setCalle(rs.getString("calle"));
                resultado.setNumero(rs.getString("numero"));
            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }

        return resultado;
    }

    @Override
    public Domicilio create(Domicilio domicilio) {
        Domicilio resultado = null;

        //[1] Obtener y levantar el controlador
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)){

            stmt.setInt(1, domicilio.getId());
            stmt.setString(2, domicilio.getCalle());
            stmt.setString(3, domicilio.getNumero());

            if(stmt.executeUpdate() == 1){
                resultado =  domicilio;
            }

        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }

        return resultado;
    }
}
