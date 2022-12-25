
package com.portfolio.demoPortfolio.repository;

import com.portfolio.demoPortfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long> {
    
}
