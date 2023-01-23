
package com.portfolio.demoPortfolio.controller;

import com.portfolio.demoPortfolio.model.Persona;
import com.portfolio.demoPortfolio.service.PersonaService;
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
//@CrossOrigin(origins = "https://moralesjavierportfolio-4cb60.firebaseapp.com")
@RestController
public class PersonaController {
    
    @Autowired
    public PersonaService persoService;
    
    
    @GetMapping("/traepersona")
    @ResponseBody
    public Persona getPersona(){
        return persoService.traePersona();
    }
    
    @GetMapping("traepersonas")
    @ResponseBody
    public List<Persona> getPersonas(){
        return persoService.traePersonas();
    }
    
    @PostMapping("/creapersona")
    public void savePersona(@RequestBody Persona per){
        persoService.creaPersona(per);
    }
    
    @PutMapping("/actualizaPersona")
    public void updatePersona(@RequestBody Persona per){
        persoService.modificaPersona(per);
    }
    //@PathVariable("id") Long id,
    
    @DeleteMapping("/eliminapersona")
    public void deletePersona(@RequestBody Persona per){
        persoService.eliminaPersona(per);
    }
    
}
