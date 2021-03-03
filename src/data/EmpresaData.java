package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Empresa;
import java.sql.ResultSet;

public class EmpresaData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public Empresa getBusiness(){
        
        String query = "{ call get_business() }";
        ResultSet rs;
        Empresa empresa = new Empresa(); 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
            }
            
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        return empresa;
    }
    
    public int updateBusiness(Empresa empresa){

        /*String sql = "SELECT * FROM BawoDev.Usuario WHERE usuario='"+usuario+"' AND contrasenna='"+contrasenna+"'  ";
        
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
        }*/
        return 0;
    }
    
}