package com.Brustock.home.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produccion") // Opcional, si el nombre de la tabla es diferente al de la clase
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReferencia;

    private String procesoP;
    private String tallasE;
    private String tallasR;

    // Getters y setters
    public Long getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Long idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getProcesoP() {
        return procesoP;
    }

    public void setProcesoP(String procesoP) {
        this.procesoP = procesoP;
    }

    public String getTallasE() {
        return tallasE;
    }

    public void setTallasE(String tallasE) {
        this.tallasE = tallasE;
    }

    public String getTallasR() {
        return tallasR;
    }

    public void setTallasR(String tallasR) {
        this.tallasR = tallasR;
    }
}
