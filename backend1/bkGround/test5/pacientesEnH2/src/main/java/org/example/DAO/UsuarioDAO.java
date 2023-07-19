package org.example.DAO;

import org.example.model.Usuario;

import java.nio.channels.ScatteringByteChannel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class UsuarioDAO implements DAO<Usuario>{


    private static final String SQL_INSERT = "INSERT INTO USUARIO(ID, NOMBRE, EMAIL, SUELDO) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE USUARIO SET SUELDO=? WHERE EMAIL=?";

    @Override
    public Usuario guardar(Usuario usuario) throws SQLException {
        //ahora vamos a guardar este usuario en la base de datos
        Connection con = null;
        try {
            con = getConnection();

            //crea un Prepare para hacer el insert
            PreparedStatement psInsert = con.prepareStatement(SQL_INSERT);

            psInsert.setLong(1, usuario.getId());
            psInsert.setString(2, usuario.getNombre());
            psInsert.setString(3, usuario.getEmail());
            psInsert.setDouble(4, usuario.getSueldo());

            psInsert.executeUpdate();

            psInsert.close();
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback(); //vuelve todo para atras hasta el anterior commit
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  finally {
            con.close();
        }

        return usuario;
    }

    public void modificar(String email) throws SQLException {
        Connection con = null;
        try {
            con = getConnection();
            Statement statement = con.createStatement();


            Usuario user = new Usuario();
            user = buscarXemail(email);

        //esto se podria decir que es una transaccion por eso se false el autoCommit para poder usar el rollback si nos equivocamos

        con.setAutoCommit(false);

        //actualizo los datos de uno de los usuarios
        PreparedStatement psUpdate = con.prepareStatement(SQL_UPDATE);
        psUpdate.setDouble(1, user.subirSueldo(500.0));
        psUpdate.setString(2, email);

        psUpdate.executeUpdate();
        con.commit();

        con.setAutoCommit(true); //lo dejo como estaba, ya que el rollback lo hago si ocurre algun problema en el codigo anterior
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback(); //vuelve todo para atras hasta el anterior commit

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

        @Override
    public void eliminar(Long id) throws SQLException {
            Connection con = null;
            try {
                con = getConnection();

                //crea un Prepare para hacer el insert
                PreparedStatement psInsert = con.prepareStatement("DELETE FROM USUARIO WHERE id=?");

                psInsert.setLong(1, id);

                psInsert.executeUpdate();

                psInsert.close();
            } catch (SQLException e) {
                e.printStackTrace();
                con.rollback(); //vuelve todo para atras hasta el anterior commit
            } catch (Exception e) {
                throw new RuntimeException(e);
            }  finally {
                con.close();
            }
    }

    public Usuario buscarXemail(String email) throws SQLException {
        Usuario user = new Usuario();
        Connection con = null;
        try {
            con = getConnection();

            //crea un Prepare para hacer el insert
            PreparedStatement psInsert = con.prepareStatement("SELECT * FROM USUARIO WHERE email=?");

            psInsert.setString(1, email);
            ResultSet rs = psInsert.executeQuery();

            while (rs.next()){
                Long id2 = rs.getLong("ID");
                String nombre = rs.getString("NOMBRE");
                //String email = rs.getString("EMAIL");
                double sueldo = rs.getDouble("SUELDO");

                user.setId(id2);
                user.setNombre(nombre);
                user.setEmail(email);
                user.setSueldo(sueldo);


            }

            psInsert.close();
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback(); //vuelve todo para atras hasta el anterior commit
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  finally {
            con.close();
        }

        return user;
    }


    @Override
    public Usuario buscar(Long id) throws SQLException {
        Usuario user = new Usuario();
        Connection con = null;
        try {
            con = getConnection();

            //crea un Prepare para hacer el insert
            PreparedStatement psInsert = con.prepareStatement("SELECT * FROM USUARIO WHERE id=?");

            psInsert.setLong(1, id);
            ResultSet rs = psInsert.executeQuery();

            while (rs.next()){
                Long id2 = rs.getLong("ID");
                String nombre = rs.getString("NOMBRE");
                String email = rs.getString("EMAIL");
                double sueldo = rs.getDouble("SUELDO");

                user.setId(id2);
                user.setNombre(nombre);
                user.setEmail(email);
                user.setSueldo(sueldo);

                System.out.println(id2+"\t"+nombre+"\t"+email+"\t"+sueldo+"\t");//
            }

            psInsert.close();
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback(); //vuelve todo para atras hasta el anterior commit
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  finally {
            con.close();
        }

        return user;
    }

    @Override
    public List<Usuario> buscarTodos() throws SQLException {
        ArrayList<Usuario> users = new ArrayList();
        Connection con = null;
        try {
            con = getConnection();

            //crea un Prepare para hacer el insert
            PreparedStatement psInsert = con.prepareStatement("SELECT * FROM USUARIO");

            ResultSet rs = psInsert.executeQuery();

            while (rs.next()){
                Long id2 = rs.getLong("ID");
                String nombre = rs.getString("NOMBRE");
                String email = rs.getString("EMAIL");
                double sueldo = rs.getDouble("SUELDO");

                Usuario user = new Usuario();
                user.setId(id2);
                user.setNombre(nombre);
                user.setEmail(email);
                user.setSueldo(sueldo);

                System.out.println(id2+"\t"+nombre+"\t"+email+"\t"+sueldo+"\t");//
                users.add(user);
            }

            psInsert.close();
        } catch (SQLException e) {
            e.printStackTrace();
            con.rollback(); //vuelve todo para atras hasta el anterior commit
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  finally {
            con.close();
        }
        return users;
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:C:\\\\H2\\\\Database\\\\my", "sa","sa");
    }


}
