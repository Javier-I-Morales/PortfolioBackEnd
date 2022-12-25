
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> traeListaEducacion();
    public void creaEducacion(Educacion edu);
    public void modificaEducacion(Educacion edu);
    public void eliminaEducacion(Educacion edu);
    public void eliminaEducacionId(Long id);
}
