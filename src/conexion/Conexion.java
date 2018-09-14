package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection con = null;

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario ="root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/banco";
    
    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (con == null) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(url, usuario, password);
            if(con != null){
                System.out.print("conexion establecida..");
            }
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return con;
    }

    public static void cerrar() throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}
