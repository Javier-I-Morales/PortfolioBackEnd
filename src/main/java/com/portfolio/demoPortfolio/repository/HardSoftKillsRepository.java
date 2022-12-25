
package com.portfolio.demoPortfolio.repository;

import com.portfolio.demoPortfolio.model.HardSoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HardSoftKillsRepository extends JpaRepository<HardSoftSkills,Long> {
    
}
