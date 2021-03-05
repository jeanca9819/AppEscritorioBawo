package data;

import com.mysql.jdbc.Connection;
import utility.Utilities;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
 
    private static Connection connection;
    Utilities utilities = new Utilities();
    
    public Connection conexion(){

        connection = null;
        try {
            Class.forName(utilities.driver);
            connection = (Connection) DriverManager.getConnection(utilities.url, utilities.user, utilities.password);
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e.getMessage());
        }
        return connection;
    }
    
}