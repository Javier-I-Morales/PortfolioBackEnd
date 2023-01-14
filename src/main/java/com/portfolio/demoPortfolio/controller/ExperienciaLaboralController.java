
package com.portfolio.demoPortfolio.controller;

import com.portfolio.demoPortfolio.model.ExperienciaLaboral;
import com.portfolio.demoPortfolio.service.ExperienciaLaboralService;
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

//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://portfoliok-a7a1b.firebaseapp.com")
//@CrossOrigin(origins = "https://moralesjavierportfolio.firebaseapp.com")
@CrossOrigin(origins = "https://moralesjavierportfolio-4cb60.firebaseapp.com")
@RestController
public class ExperienciaLaboralController {
    
    @Autowired
    public ExperienciaLaboralService expelabo;
    
    @GetMapping("/traeexperiencia")
    @ResponseBody
    public List<ExperienciaLaboral> getExperienciaLaboral(){
        return expelabo.traeListaEsperienca();
    }
    
    @PostMapping("/creaexperiencia")
    public void saveExperienciaLaboral(@RequestBody ExperienciaLaboral exp){
        expelabo.creaExperienciaLaboral(exp);
    }
    
    @PutMapping("/actualizaexperiencia")
    public void updateExperienciaLaboral(@RequestBody ExperienciaLaboral exp){
        expelabo.modificaExperienciaLaboral(exp);
    }
    
//    @DeleteMapping("/eliminaexperiencia")
//    public void deleteExperienciaLaboral(@RequestBody ExperienciaLaboral exp){
//        expelabo.eliminaExperienciaLaboral(exp);
//    }
    
    @DeleteMapping("/eliminaexperienciaid/{id}")
    public void deleteExperienciaId(@PathVariable Long id){
        expelabo.eliminaExperienciaLaboralId(id);
    }
    
    
}
