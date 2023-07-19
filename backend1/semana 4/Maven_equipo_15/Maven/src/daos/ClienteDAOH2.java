package daos;

import entidades.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOH2 implements IDAO<Cliente>{

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    //private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    @Override
    public Cliente guardar(Cliente cliente) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // 1 - levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2 - preparar una sentencia
            preparedStatement = connection.prepareStatement("INSERT INTO CLIENTES VALUES (?,?,?)");
            preparedStatement.setLong(1, cliente.getId());
            preparedStatement.setString(2, cliente.getNombre());
            preparedStatement.setString(3, cliente.getApellido());

            // 3 - Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;

    }

    @Override
    public void eliminar(Long id) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // 1 - levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2 - preparar una sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM CLIENTES WHERE id = ?");
            preparedStatement.setLong(1,id);

            // 3 - Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cliente buscar(Long id) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Cliente cliente = null;

        try {
            // 1 - levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2 - preparar una sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM CLIENTES WHERE id = ?");
            preparedStatement.setLong(1,id);

            // 3 - Ejecutar la sentencia
            ResultSet resultSet = preparedStatement.executeQuery();

            // 4 - Evaluar los resultados
            while(resultSet.next()) {
                Long idCliente = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                cliente = new Cliente();
                cliente.setId(idCliente);
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
            }

            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;

    }

    @Override
    public List<Cliente> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List <Cliente> clientes = new ArrayList();

        try {
            // 1 - levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2 - preparar una sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM CLIENTES");

            // 3 - Ejecutar la sentencia
            ResultSet resultSet = preparedStatement.executeQuery();

            // 4 - Evaluar los resultados
            while(resultSet.next()) {
                Long idCliente = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                Cliente cliente = new Cliente();
                cliente.setId(idCliente);
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);

                clientes.add(cliente);

            }

            preparedStatement.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return clientes;

    }
}
