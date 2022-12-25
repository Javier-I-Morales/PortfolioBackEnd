
package com.portfolio.demoPortfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Getter @Setter
@Entity
public class Usuario {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NonNull
    private String email;
    @NonNull
    private String password;
    
    private String jwt;
    
    public Usuario(){}
    
    public Usuario(Long id, String email, String pass, String jwt){
        this.id = id;
        this.email=email;
        this.password = pass;
        this.jwt = jwt;
    }
    
    
}
