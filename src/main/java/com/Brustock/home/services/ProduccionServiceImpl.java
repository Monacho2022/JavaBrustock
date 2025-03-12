/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Brustock.home.services;

import com.Brustock.home.model.Produccion;
import com.Brustock.home.repository.ProduccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maniz
 */
@Service
public class ProduccionServiceImpl implements ProduccionService {

    @Autowired
    private ProduccionRepository produccionRepository;

    @Override
    public Produccion newProduccion(Produccion newProduccion) {
        return produccionRepository.save(newProduccion);
    }

    @Override
    public Iterable<Produccion> getAll() {
        return produccionRepository.findAll();
    }

    @Override
    public Produccion modifyProduccion(Produccion produccion) {
        Optional<Produccion> productoEncontrado = produccionRepository.findById(produccion.getIdReferencia());
        if (productoEncontrado.isPresent()) {
            Produccion produccionExistente = productoEncontrado.get();
            produccionExistente.setIdReferencia(produccion.getIdReferencia());
            produccionExistente.setProcesoP(produccion.getProcesoP());
            produccionExistente.setTallasE(produccion.getTallasE());
            produccionExistente.setTallasR(produccion.getTallasR());
            return produccionRepository.save(produccionExistente);
        }
        return null;
    }

    @Override
    public boolean deleteProduccion(Long idReferencia) {
        if (produccionRepository.existsById(idReferencia)) {
            produccionRepository.deleteById(idReferencia);
            return true;
        }
        return false;
    }
}
