
package com.portfolio.demoPortfolio.service;

import com.portfolio.demoPortfolio.model.HardSoftSkills;
import java.util.List;

public interface IHardSoftSkillsService {
    
    public List<HardSoftSkills> traeListaHSS();
    public void creaHardSoftSkills(HardSoftSkills hss);
    public void modificaHardSoftSkills(HardSoftSkills hss);
    public void eliminaHardSoftSkills(HardSoftSkills hss);
    public void eliminaSkillsId(Long id);
}
