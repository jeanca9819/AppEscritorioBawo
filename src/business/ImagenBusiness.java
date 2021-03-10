package business;

import data.ImagenData;
import domain.Imagen;
import java.util.ArrayList;

public class ImagenBusiness {
    
    ImagenData imagenData = new ImagenData();
    
    public ArrayList<Imagen> getImagenes(){
    return this.imagenData.getImagenes();
    }
    
    public int addImagen(Imagen imagen){
    return this.imagenData.addImagen(imagen);
    }
}
