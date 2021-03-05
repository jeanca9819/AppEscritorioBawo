package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;

public class UsuarioData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public boolean getUser(String usuario, String contrasenna){

        String query = "{ call getUsuario(?,?) }";
        ResultSet rs;
        boolean result = false; 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            stmt.setString(1, usuario);
            stmt.setString(2, contrasenna);
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                result = true;
                
            }else{
                
                result = false;
                
            }
            
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        return result;
    }
    
}