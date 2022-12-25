
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Usuario;
import com.portfolio.demoPortfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired // PERMITE LA INJ DE DEP
    public UsuarioRepository usurepo;

    @Override
    public Usuario traerUsuario(String email, String pass) {
        List<Usuario> lista = usurepo.findAll();
        Usuario user = new Usuario(0L,"none","none","none");
        for(Usuario usuario : lista){
            String v1 = usuario.getEmail();
            String v2 = usuario.getPassword();
            if(v1.equalsIgnoreCase(email) && v2.equalsIgnoreCase(pass)){
                return usuario;
            }
        }
        return user;
    }

    @Override
    public void crearUsuario(Usuario user) {
        usurepo.save(user);
    }

    @Override
    public void eliminarUsuario(Usuario user) {
        usurepo.delete(user);
    }

    @Override
    public String existeUsuario(String email, String pass) {
        List<Usuario> lista = usurepo.findAll();
        String resultado = "0";
        for(Usuario usuario : lista){
            String v1 = usuario.getEmail();
            String v2 = usuario.getPassword();
            if(v1.equalsIgnoreCase(email) && v2.equalsIgnoreCase(pass)){
                resultado =  "1";
            }
        }
        return resultado;
    }
    
}
