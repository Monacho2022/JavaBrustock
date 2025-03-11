
package com.Brustock.home.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Produccion {
    @Id
    @Column
    private Long idReferencia;
    
    @Column
    private String procesoP;
    
    @Column
    private String tallasE;
    
    @Column
    private String tallasR;
    
    
}
