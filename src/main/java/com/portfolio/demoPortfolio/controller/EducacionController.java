
package com.portfolio.demoPortfolio.controller;

import com.portfolio.demoPortfolio.model.Educacion;
import com.portfolio.demoPortfolio.service.EducacionService;
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


@CrossOrigin(origins = "https://portfoliok-a7a1b.firebaseapp.com")
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EducacionController {
    
    
    @Autowired
    public EducacionService educaService;
    
    @GetMapping("/traeeducacion")
    @ResponseBody
    public List<Educacion> getEducacion(){
        return educaService.traeListaEducacion();
    }
    
    @PostMapping("/creaeducacion")
    public void saveEducacion(@RequestBody Educacion edu){
        educaService.creaEducacion(edu);
    }
    
    @PutMapping("/actualizaeducacion")
    public void updateEducacion(@RequestBody Educacion edu){
        educaService.modificaEducacion(edu);
    }
    
//    @DeleteMapping("/eliminaeducacion")
//    public void deleteEducacion(@RequestBody Educacion edu){
//        educaService.eliminaEducacion(edu);
//    }
    
    @DeleteMapping("/eliminaeducacionid/{id}")
    public void deleteEducacionId(@PathVariable Long id){
        educaService.eliminaEducacionId(id);
    }
}
