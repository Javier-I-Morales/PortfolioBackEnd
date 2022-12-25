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
public class Educacion {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String instituto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafin ;
    private String titulo;
    private String numeroimagen;
    
    public Educacion(){}
    
    public Educacion(Long id, String instituto, Date fechainicio, Date fechafin, String titulo, String numeroimagen){
        this.id = id;
        this.instituto=instituto;
        this.fechainicio = fechafin;
        this.fechafin = fechainicio;
        this.titulo = titulo;
        this.numeroimagen = numeroimagen;
    }
    
    
}
