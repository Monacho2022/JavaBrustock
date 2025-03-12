/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Brustock.home.repository;

import com.Brustock.home.model.Produccion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maniz
 */
public interface ProduccionRepository extends JpaRepository<Produccion,Long>{

    public Produccion save(Optional<Produccion> productoEncontrado);
    
}
