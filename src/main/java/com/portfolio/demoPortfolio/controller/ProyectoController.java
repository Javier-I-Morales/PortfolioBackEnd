
package com.portfolio.demoPortfolio.controller;

import com.portfolio.demoPortfolio.model.Proyecto;
import com.portfolio.demoPortfolio.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProyectoController {
    
    @Autowired
    public ProyectoService proser;
    
    @GetMapping("/traeproyectos")
    @ResponseBody
    public List<Proyecto> getProyectos(){
        return proser.traeListaProyecto();
    }
    
    @PostMapping("/creaproyecto")
    public void createProyecto(@RequestBody Proyecto pro){
        proser.creaProyecto(pro);
    }
    
    @PutMapping("/actualizaproyecto")
    public void updateProyecto(@RequestBody Proyecto pro){
        proser.modificaProyecto(pro);
    }
    
//    @DeleteMapping("/eliminaproyecto")
//    public void deleteProyecto(@RequestBody Proyecto pro){
//        proser.eliminaProyecto(pro);
//    }
    
    @DeleteMapping("/eliminaproyectoid/{id}")
    public void deleteProyectoId(@PathVariable Long id){
        proser.eliminaProyectoId(id);
    }
}
