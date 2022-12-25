
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.HardSoftSkills;
import com.portfolio.demoPortfolio.repository.HardSoftKillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSoftSkillsService implements IHardSoftSkillsService {
    
    @Autowired
    public HardSoftKillsRepository hssRepo;

    @Override
    public List<HardSoftSkills> traeListaHSS() {
        return hssRepo.findAll();
    }

    @Override
    public void creaHardSoftSkills(HardSoftSkills hss) {
        hssRepo.save(hss);
    }

    @Override
    public void modificaHardSoftSkills(HardSoftSkills hss) {
        hssRepo.save(hss);
    }

    @Override
    public void eliminaHardSoftSkills(HardSoftSkills hss) {
        hssRepo.delete(hss);
    }
    
    @Override
    public void eliminaSkillsId(Long id) {
        hssRepo.deleteById(id);
    }
    
}
