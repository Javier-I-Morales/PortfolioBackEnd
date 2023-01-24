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
public class Proyecto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecharealizacion;
    private String link;
    private String descripcion;
    private String linkdos;
    
    public Proyecto(){}
    
    public Proyecto(Long id, String nombre, Date fecharealizacion, String link, String descripcion, String linkdos){
        this.id = id;
        this.nombre=nombre;
        this.fecharealizacion = fecharealizacion;
        this.link = link;
        this.descripcion = descripcion;
        this.linkdos = linkdos;
    }
    
    
}
