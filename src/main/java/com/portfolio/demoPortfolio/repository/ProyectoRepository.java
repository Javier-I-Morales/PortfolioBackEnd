
package com.portfolio.demoPortfolio.repository;

import com.portfolio.demoPortfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
    
}
