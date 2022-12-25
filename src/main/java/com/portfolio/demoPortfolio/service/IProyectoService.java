
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> traeListaProyecto();
    public void creaProyecto(Proyecto pro);
    public void modificaProyecto(Proyecto pro);
    public void eliminaProyecto(Proyecto pro);
    public void eliminaProyectoId(Long id);
    
}
