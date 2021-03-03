package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Categoria;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaData {
 
    ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public List<Categoria> getCategories(){
        List<Categoria> categorias = new ArrayList<>();
 
        return categorias;
    }
    
    public int updateVisibility(Categoria categoria){
        return 0;
    }
    
    public int addCategory(Categoria categoria){
        return 0;
    }
    
}
