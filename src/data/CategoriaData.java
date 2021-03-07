package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Categoria;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoriaData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public ArrayList<Categoria> getCategories(){
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        
        String query = "{ call getAllCategorias() }";
        ResultSet rs;
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigo(rs.getInt("codigo"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setVisibilidad(rs.getBoolean("visibilidad"));
                categorias.add(categoria);
            }
            rs.close();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        
        return categorias;
    }
    
    public int updateVisibility(Categoria categoria){
        return 0;
    }
    
    public int addCategory(String categoria){
        String query = "{ call saveCategoria(?) }";
        ResultSet rs;
        int result = 0; 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            stmt.setString(1, categoria);
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
