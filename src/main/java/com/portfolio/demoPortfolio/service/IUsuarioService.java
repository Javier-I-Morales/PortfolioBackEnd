
package com.portfolio.demoPortfolio.service;
import com.portfolio.demoPortfolio.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public Usuario traerUsuario(String email, String pass);
    public void crearUsuario(Usuario user);
    public void eliminarUsuario(Usuario user);
    public String existeUsuario(String email, String pass);

}
