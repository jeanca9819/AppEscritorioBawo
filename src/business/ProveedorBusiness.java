package business;

import data.ProveedorData;
import domain.Proveedor;
import java.util.ArrayList;

public class ProveedorBusiness {
        
    ProveedorData proveedorData = new ProveedorData();
    
    public ArrayList<Proveedor> getProveedores(){
    return this.proveedorData.getProveedores();
    }
    
    public int addProveedor(Proveedor proveedor){
    return this.proveedorData.addProveedor(proveedor);
    }
}
