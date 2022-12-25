package com.portfolio.demoPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class HardSoftSkills {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String nombre;
    private int porcentaje;
    
    public HardSoftSkills(){}
    
    public HardSoftSkills(Long id,String tipo, String nombre, int porcentaje){
        this.id = id;
        this.tipo = tipo;
        this.nombre=nombre;
        this.porcentaje = porcentaje;
    }
    
    
}
