
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public Persona traePersona();
    public List<Persona> traePersonas();
    public void creaPersona(Persona per);
    public void modificaPersona(Persona per);
    public void eliminaPersona(Persona per);
}
