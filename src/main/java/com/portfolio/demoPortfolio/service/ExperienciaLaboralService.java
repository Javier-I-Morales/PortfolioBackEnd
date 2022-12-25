
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.ExperienciaLaboral;
import com.portfolio.demoPortfolio.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    public ExperienciaLaboralRepository expLabRepo;

    @Override
    public List<ExperienciaLaboral> traeListaEsperienca() {
        return expLabRepo.findAll();
    }

    @Override
    public void creaExperienciaLaboral(ExperienciaLaboral exp) {
        expLabRepo.save(exp);
    }

    @Override
    public void modificaExperienciaLaboral(ExperienciaLaboral exp) {
        expLabRepo.save(exp);
    }

    @Override
    public void eliminaExperienciaLaboral(ExperienciaLaboral exp) {
        expLabRepo.delete(exp);
    }
    
    @Override
    public void eliminaExperienciaLaboralId(Long id) {
        expLabRepo.deleteById(id);
    }
    
}
