
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Persona;
import com.portfolio.demoPortfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public Persona traePersona() {
        
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas.get(0); //persoRepo.findById(5l).orElse(null);
    }
    
    @Override
    public List<Persona> traePersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void creaPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void modificaPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void eliminaPersona(Persona per) {
        persoRepo.delete(per);
    }
    
}
