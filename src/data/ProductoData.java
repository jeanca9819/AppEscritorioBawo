package data;

import com.mysql.jdbc.Connection;
import domain.Producto;
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
        return 0;
    }
    
}
