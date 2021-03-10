package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Empresa;
import java.sql.ResultSet;

public class EmpresaData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public Empresa getBusiness(){
        
        String query = "{ call getEmpresa() }";
        ResultSet rs;
        Empresa empresa = new Empresa(); 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                empresa.setCodigo(rs.getInt("codigo"));
                empresa.setNombre(rs.getString("nombre"));
                empresa.setVision(rs.getString("vision"));
                empresa.setMision(rs.getString("mision"));
                empresa.setHistoria(rs.getString("historia"));
                empresa.setTelefono1(rs.getString("telefono_1"));
                empresa.setTelefono2(rs.getString("telefono_2"));
                empresa.setCorreo(rs.getString("correo"));
                empresa.setDireccion(rs.getString("direccion"));
                empresa.setFacebook(rs.getString("facebook"));
                empresa.setInstagram(rs.getString("instagram"));
                empresa.setWhatsapp(rs.getString("whatsapp"));
                empresa.setUrlLogo(rs.getString("url_logo"));
            }
            
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        return empresa;
    }
    
    public int updateBusiness(Empresa empresa){
        String query = "{ call saveEmpresa(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
        ResultSet rs;
        int result = 0; 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            stmt.setString(1, empresa.getNombre());
            stmt.setString(2, empresa.getVision());
            stmt.setString(3, empresa.getMision());
            stmt.setString(4, empresa.getHistoria());
            stmt.setString(5, empresa.getTelefono1());
            stmt.setString(6, empresa.getTelefono2());
            stmt.setString(7, empresa.getCorreo());
            stmt.setString(8, empresa.getDireccion());
            stmt.setString(9, empresa.getFacebook());
            stmt.setString(10, empresa.getInstagram());
            stmt.setString(11, empresa.getWhatsapp());
            stmt.setString(12, empresa.getUrlLogo());
            rs = stmt.executeQuery();
            result = 1;
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
            result = 0;
        }
        return result;
    }
    
}