package data;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import domain.Proveedor;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProveedorData {
     ConexionBD conexionBD = new ConexionBD();
    Connection connection = conexionBD.conexion();
    
    public ArrayList<Proveedor> getProveedores(){
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        String query = "{ call getAllProveedores() }";
        ResultSet rs;
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setCodigo(rs.getInt("codigo"));
                proveedor.setNombre(rs.getString("nombre"));
                proveedor.setDescripcion(rs.getString("descripcion"));
                proveedor.setUrlImagen(rs.getString("imagen"));
                
                proveedores.add(proveedor);
            }
            rs.close();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
        
        return proveedores;
    }
    
    public int addProveedor(Proveedor proveedor){
        String query = "{ call saveProveedor(?, ?, ?) }";
        ResultSet rs;
        int result = 0; 
        
        try{
            CallableStatement stmt = (CallableStatement) connection.prepareCall(query);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(4, proveedor.getDescripcion());
            stmt.setString(5, proveedor.getUrlImagen());
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
