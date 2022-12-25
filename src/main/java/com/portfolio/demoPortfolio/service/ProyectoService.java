
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Proyecto;
import com.portfolio.demoPortfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proRepo;

    @Override
    public List<Proyecto> traeListaProyecto() {
        return proRepo.findAll();
    }

    @Override
    public void creaProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void modificaProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void eliminaProyecto(Proyecto pro) {
        proRepo.delete(pro);
    }
    
    @Override
    public void eliminaProyectoId(Long id) {
        proRepo.deleteById(id);
    }
    
}
