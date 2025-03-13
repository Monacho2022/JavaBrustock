
package com.Brustock.home.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class IngresoProduccion {
    @Id
    @Column
    private Long referencia;  // Clave primaria

    @Column
    private String descripcion;

    @Column
    private String proceso;

    @Column
    private String talla;

    @Column
    private String color;

    @Column
    private String fecha;
}