package dao;

import model.Cancion;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCancionH2 implements IDao<Cancion>{

    String url = "jdbc:h2:~/db_canciones_20231;INIT=RUNSCRIPT FROM 'create.sql'";
    String username = "sa";
    String password = "";

//

    Logger logger = Logger.getLogger(DaoCancionH2.class);

    @Override
    public Cancion findById(String id) {

        Cancion resultado = null;

        //[1] Obtener y levantar el controlador
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        try(Connection conn = DriverManager.getConnection(url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM canciones WHERE id = ?")){

            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                //Convertimos el registro del Result Set en un objeto de Java propio del modelo de la aplicación
            }


        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }

        return resultado;
    }

    @Override
    public Cancion create(Cancion cancion) {
        //[1] Obtener y levantar el controlador
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error(ex.getMessage());
        }

        //[2] Abrir la conexión a la base de datos, y usar esa conexión para crear un objeto tipo PreparedStatement
        try(Connection conn = DriverManager.getConnection(url, this.username, this.password);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO canciones(id, nombre, artista, genero) VALUES(?, ?, ?, ?)")){

            stmt.setString(1, cancion.getId());
            stmt.setString(3, cancion.getArtista());
            stmt.setString(2, cancion.getNombre());
            stmt.setString(4, cancion.getGenero());

            int rowsAffected = stmt.executeUpdate();

            if(rowsAffected == 1){
                return cancion;
            }


        } catch (SQLException ex) {
            logger.error(ex.getMessage());
        }

        return null;
    }
}
