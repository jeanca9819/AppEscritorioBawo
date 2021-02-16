package domain;

public class Imagen {
    
    private int codigoImagen;
    private String nombre;
    private String urlImagen;

    public Imagen(int codigoImagen, String nombre, String urlImagen) {
        this.codigoImagen = codigoImagen;
        this.nombre = nombre;
        this.urlImagen = urlImagen;
    }

    public Imagen() {
    }

    public int getCodigoImagen() {
        return codigoImagen;
    }

    public void setCodigoImagen(int codigoImagen) {
        this.codigoImagen = codigoImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Imagen{" + "codigoImagen=" + codigoImagen + ", nombre=" + nombre + ", urlImagen=" + urlImagen + '}';
    }
}
