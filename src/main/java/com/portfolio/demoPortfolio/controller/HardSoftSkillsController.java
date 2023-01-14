
package com.portfolio.demoPortfolio.controller;

import com.portfolio.demoPortfolio.model.HardSoftSkills;
import com.portfolio.demoPortfolio.service.HardSoftSkillsService;
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

//@CrossOrigin(origins = "https://portfoliok-a7a1b.firebaseapp.com")
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://moralesjavierportfolio.firebaseapp.com")
@CrossOrigin(origins = "https://moralesjavierportfolio-4cb60.firebaseapp.com")
@RestController
public class HardSoftSkillsController {
    
    @Autowired
    public HardSoftSkillsService hsservice;
    
    @GetMapping("/traeskills")
    @ResponseBody
    public List<HardSoftSkills> getSkills(){
        return hsservice.traeListaHSS();
    }
    
    @PostMapping("/creaskills")
    public void createSkills(@RequestBody HardSoftSkills hss){
        hsservice.creaHardSoftSkills(hss);
    }
    
    @PutMapping("/actualizaskills")
    public void updateSkills(@RequestBody HardSoftSkills skills){
        hsservice.modificaHardSoftSkills(skills);
    }
    
//    @DeleteMapping("/eliminaskills")
//    public void deleteSkills(@RequestBody HardSoftSkills skills){
//        hsservice.eliminaHardSoftSkills(skills);
//    }
    
    @DeleteMapping("/eliminaskillsid/{id}")
    public void deleteSkillsId(@PathVariable Long id){
        hsservice.eliminaSkillsId(id);
    }
    
}
