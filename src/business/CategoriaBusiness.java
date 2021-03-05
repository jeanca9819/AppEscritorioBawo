package business;

import data.CategoriaData;
import domain.Categoria;
import java.util.List;

public class CategoriaBusiness {
    
    CategoriaData categoriaData = new CategoriaData();
    
    public List<Categoria> getCategories(){
    return this.categoriaData.getCategories();
    }
    
    public int updateVisibility(Categoria categoria){
    return this.categoriaData.updateVisibility(categoria);
    }
    
    public int addCategory(String categoria){
    return this.categoriaData.addCategory(categoria);
    }
}
