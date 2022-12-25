
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Educacion;
import com.portfolio.demoPortfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> traeListaEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void creaEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void modificaEducacion(Educacion edu) {
        eduRepo.save(edu); 
    }

    @Override
    public void eliminaEducacion(Educacion edu) {
        eduRepo.delete(edu);
    }
    
    @Override
    public void eliminaEducacionId(Long id) {
        eduRepo.deleteById(id);
    }
    
}
