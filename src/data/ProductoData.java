package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoData {
     ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public List<Producto> getProducts(){
        List<Producto> productos = new ArrayList<>();
 
        return productos;
    }
    
    public int updateProduct(Producto producto){
        return 0;
    }
    
    public int addProduct(Producto producto){
        String query = "{ call saveProducto(?, ?, ?, ?, ?, ?) }";
        ResultSet rs;
        int result = 0; 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            stmt.setString(1, producto.getNombre());
            stmt.setFloat(2, producto.getPrecio());
            stmt.setString(3, producto.getInformacionNutricional());
            stmt.setString(4, producto.getDescripcion());
            stmt.setString(5, producto.getUrlImagen());
            stmt.setInt(6, producto.getCategoria().getCodigo());
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
