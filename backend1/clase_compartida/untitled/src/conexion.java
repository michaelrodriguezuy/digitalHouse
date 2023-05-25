import java.sql.*;

public class conexion {

    //Código para crear una tabla. Elimina la tabla si esta ya existe y la
    //vuelve a crear

    private static final String CREATE_TABLE = "DROP TABLE IF EXISTS TEST9;\n" +
            "CREATE TABLE TEST9(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
            "INSERT INTO TEST9 VALUES(1, 'Hello');\n" +
            "INSERT INTO TEST9 VALUES(2, 'World3454545');\n";

    private static final String INSERT_TABLE = "INSERT INTO TEST9 VALUES(9, 'Soy el noveno');";

    public static void main(String[] args) throws SQLException {

            Connection con = null;

            try{
                con = getConnection();
                Statement stmt = con.createStatement();
                //stmt.execute(CREATE_TABLE);
                //stmt.execute(INSERT_TABLE);

                String sql = "select * from TEST9";

                //Codigo para consultar todos los registros de la tabla TEST

                ResultSet rd = stmt.executeQuery(sql);

                //Código para recorrer el resultado de la consulta
                while(rd.next()) {
                    System.out.println(rd.getInt(1) +" - "+ rd.getString(2));
                }
            }

            catch (SQLException e){
                throw new RuntimeException(e);
            }
            finally {
                con.close();
            }
        }

        private static Connection getConnection () throws SQLException{

            //Class.forName("org.h2.Driver").newInstance();
            Driver conector = new org.h2.Driver();

            String url = "jdbc:h2:";
            String db = "C:\\H2\\bin\\test33";
            String user= "sa";
            String pass = "";

            Connection con = DriverManager.getConnection("jdbc:h2:C:\\H2\\bin\\test33",user,pass);

            return con;
        }

}