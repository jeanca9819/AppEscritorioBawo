package data;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

public class UsuarioData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public boolean getUser(String usuario, String contrasenna){

        String sql = "SELECT * FROM BawoDev.Usuario WHERE usuario='"+usuario+"' AND contrasenna='"+contrasenna+"'  ";
        
        boolean result = false; 
        
        try{
            Statement statement = (Statement) connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
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