package com.Brustock.home.repository;

import com.Brustock.home.model.IngresoProduccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoProduccionRepository extends JpaRepository<IngresoProduccion, Long> {
    boolean existsByReferencia(Long referencia);  // Usa "referencia" en lugar de "id"
    void deleteByReferencia(Long referencia);     // Usa "referencia" en lugar de "id"
}
