package com.Brustock.home.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.Brustock.home.model")
public class IngresoProduccion {
    private Long idReferencia;
    private String referencia;
    private String descripcion;
    private String proceso;
    private String talla;
    private String color;
    private String fecha;

    // Getters
    public Long getIdReferencia() { return idReferencia; }
    public String getReferencia() { return referencia; }
    public String getDescripcion() { return descripcion; }
    public String getProceso() { return proceso; }
    public String getTalla() { return talla; }
    public String getColor() { return color; }
    public String getFecha() { return fecha; }

    // Setters
    public void setIdReferencia(Long idReferencia) { this.idReferencia = idReferencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setProceso(String proceso) { this.proceso = proceso; }
    public void setTalla(String talla) { this.talla = talla; }
    public void setColor(String color) { this.color = color; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
