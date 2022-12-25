
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> traeListaEsperienca();
    public void creaExperienciaLaboral(ExperienciaLaboral exp);
    public void modificaExperienciaLaboral(ExperienciaLaboral exp);
    public void eliminaExperienciaLaboral(ExperienciaLaboral exp);
    public void eliminaExperienciaLaboralId(Long id);
}
