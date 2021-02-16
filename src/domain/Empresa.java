package domain;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    
    private int codigo;
    private String nombre;
    private String vision;
    private String mision;
    private String historia;
    private String telefono1;
    private String telefono2;
    private String correo;
    private String direccion;
    private String facebook;
    private String whatsapp;
    private String instagram;
    private String urlLogo;
    private List<Imagen> imagenes;

    public Empresa() {
    }

    public Empresa(int codigo, String nombre, String vision, String mision, String historia, String telefono1, String telefono2, String correo, String direccion, String facebook, String whatsapp, String instagram, String urlLogo, List<Imagen> imagenes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.vision = vision;
        this.mision = mision;
        this.historia = historia;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correo = correo;
        this.direccion = direccion;
        this.facebook = facebook;
        this.whatsapp = whatsapp;
        this.instagram = instagram;
        this.urlLogo = urlLogo;
        this.imagenes = new ArrayList<Imagen>();
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

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public String toString() {
        return "Empresa{" + "codigo=" + codigo + ", nombre=" + nombre + ", vision=" + vision + ", mision=" + mision + ", historia=" + historia + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correo=" + correo + ", direccion=" + direccion + ", facebook=" + facebook + ", whatsapp=" + whatsapp + ", instagram=" + instagram + ", urlLogo=" + urlLogo + ", imagenes=" + imagenes + '}';
    }
}
