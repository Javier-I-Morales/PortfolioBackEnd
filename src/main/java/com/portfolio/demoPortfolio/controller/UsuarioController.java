
package com.portfolio.demoPortfolio.controller;

import com.portfolio.demoPortfolio.model.Usuario;
import com.portfolio.demoPortfolio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfoliok-a7a1b.firebaseapp.com/portfolio")
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioService ususervice;
    
    @PostMapping("/newuser")
    public void agregaUsuario(@RequestBody Usuario user){
        ususervice.crearUsuario(user);
    }
    
    @GetMapping("/buscauser/{email}/{pass}")
    @ResponseBody
    public Usuario buscaUsuario(@PathVariable String email,@PathVariable String pass){
        return ususervice.traerUsuario(email, pass);
    }
    
    @DeleteMapping("/deleteuser")
    public void eliminaUsuario(@RequestBody Usuario user){
        ususervice.eliminarUsuario(user);
    }
    
    @GetMapping("/existeuser/{email}/{pass}")
    public String existeUsuario(@PathVariable String email,@PathVariable String pass){
        return ususervice.existeUsuario(email, pass);
    }
}
