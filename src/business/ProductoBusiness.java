package business;

import data.ProductoData;
import domain.Producto;
import java.util.ArrayList;

public class ProductoBusiness {
        
    ProductoData productoData = new ProductoData();
    
    public ArrayList<Producto> getProducts(){
    return this.productoData.getProducts();
    }
    
    public int updateProduct(Producto producto){
    return this.productoData.updateProduct(producto);
    }
    
    public int addProduct(Producto producto){
    return this.productoData.addProduct(producto);
    }
}
