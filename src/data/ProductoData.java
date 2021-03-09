package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Categoria;
import domain.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductoData {
     ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public ArrayList<Producto> getProducts(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        String query = "{ call getAllProductos() }";
        ResultSet rs;
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                Categoria categoria = new Categoria();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setInformacionNutricional(rs.getString("informacion_nutricional"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setUrlImagen(rs.getString("imagen"));
                categoria.setCodigo(rs.getInt("codigo_categoria"));
                categoria.setNombre(rs.getString("nombre_categoria"));
                categoria.setVisibilidad(rs.getBoolean("visibilidad"));
                producto.setCategoria(categoria);
                
                productos.add(producto);
            }
            rs.close();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        
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
