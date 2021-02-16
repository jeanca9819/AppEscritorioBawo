package domain;

public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private String informacionNutricional;
    private String descripcion;
    private String urlImagen;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(int codigo, String nombre, float precio, String informacionNutricional, String descripcion, String urlImagen, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.informacionNutricional = informacionNutricional;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getInformacionNutricional() {
        return informacionNutricional;
    }

    public void setInformacionNutricional(String informacionNutricional) {
        this.informacionNutricional = informacionNutricional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", informacionNutricional=" + informacionNutricional + ", descripcion=" + descripcion + ", urlImagen=" + urlImagen + ", categoria=" + categoria + '}';
    }
}
