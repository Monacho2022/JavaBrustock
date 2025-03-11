/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Brustock.home.services;


import com.Brustock.home.model.Produccion;

/**
 *
 * @author maniz
 */
public interface ProduccionService {
     Produccion newProduccion (Produccion newProduccion);
    Iterable<Produccion> getAll();
    Produccion modifyAprendiz (Produccion produccion);
    boolean deleteAprendiz (Long idreferencia);     

    public Produccion modifyProduccion(Produccion produccion);
}
