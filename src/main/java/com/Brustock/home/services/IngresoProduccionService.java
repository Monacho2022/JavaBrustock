/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Brustock.home.services;

import com.Brustock.home.model.IngresoProduccion;

/**
 *
 * @author maniz
 */
public interface IngresoProduccionService {
    IngresoProduccion newIngresoProduccion (IngresoProduccion newIngresoProduccion);
    Iterable<IngresoProduccion> getAll();
    IngresoProduccion modifyAprendiz (IngresoProduccion ingresoProduccion);
    boolean deleteAprendiz (Long iduser);    

    public IngresoProduccion modifyIngresoProduccion(IngresoProduccion ingresoProduccion);

    public boolean deleteIngresoProduccion(Long id);
}
