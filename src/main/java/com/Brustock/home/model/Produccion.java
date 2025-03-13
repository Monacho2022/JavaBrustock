package com.Brustock.home.model;

public class Produccion {

    private Long idReferencia;
    private String procesoP;
    private String tallasE;
    private String tallasR;
    private IngresoProduccion ingresoProduccion; // Agrega esta línea

    // Getters y setters para idReferencia, procesoP, tallasE, tallasR
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

    // Getter y setter para ingresoProduccion
    public IngresoProduccion getIngresoProduccion() {
        return ingresoProduccion;
    }

    public void setIngresoProduccion(IngresoProduccion ingresoProduccion) {
        this.ingresoProduccion = ingresoProduccion;
    }
}