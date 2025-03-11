/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Brustock.home.repository;

import com.Brustock.home.model.IngresoProduccion;
import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maniz
 */
public interface IngresoProduccionRepository extends JpaRepository<IngresoProduccion,Long>{

    public boolean existsById(SingularAttribute<AbstractPersistable, Serializable> id);

    public void deleteById(SingularAttribute<AbstractPersistable, Serializable> id);
    
}
