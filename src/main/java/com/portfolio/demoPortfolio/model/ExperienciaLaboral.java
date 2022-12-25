package com.portfolio.demoPortfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class ExperienciaLaboral {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafin ;
    private String puesto;
    private String tarea;
    private  String numeroimagen;
    
    public ExperienciaLaboral(){}
    
    public ExperienciaLaboral(Long id, String empresa, Date fechainicio, Date fechafin, String tarea, String numeroimagen){
        this.id = id;
        this.empresa=empresa;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.tarea = tarea;
        this.numeroimagen = numeroimagen;
    }
    
    
}
