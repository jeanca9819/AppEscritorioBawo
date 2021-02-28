package business;

import data.UsuarioData;

public class UsuarioBusiness {
 
    UsuarioData usuarioData = new UsuarioData();
    
    public boolean getUser(String usuario, String contrasenna){
    return this.usuarioData.getUser(usuario, contrasenna);
    }
    
}
