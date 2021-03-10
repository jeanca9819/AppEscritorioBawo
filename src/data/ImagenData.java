package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Imagen;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ImagenData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public ArrayList<Imagen> getImagenes(){
        ArrayList<Imagen> imagenes = new ArrayList<Imagen>();
        
        String query = "{ call getImagenes() }";
        ResultSet rs;
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Imagen imagen = new Imagen();
                imagen.setCodigoImagen(rs.getInt("codigo_imagen"));
                imagen.setNombre(rs.getString("nombre"));
                imagen.setUrlImagen(rs.getString("url_imagen"));
                imagenes.add(imagen);
            }
            rs.close();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        
        return imagenes;
    }

    
    public int addImagen(Imagen imagen){
        String query = "{ call saveImagen(?, ?, ?) }";
        ResultSet rs;
        int result = 0; 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            stmt.setString(1, imagen.getNombre());
            stmt.setString(2, imagen.getUrlImagen());
            stmt.setInt(3, 1);
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
