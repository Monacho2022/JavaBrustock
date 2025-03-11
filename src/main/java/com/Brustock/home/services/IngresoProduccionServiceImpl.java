package com.Brustock.home.services;

import com.Brustock.home.model.IngresoProduccion;
import com.Brustock.home.repository.IngresoProduccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public abstract class IngresoProduccionServiceImpl implements IngresoProduccionService {

    @Autowired
    private IngresoProduccionRepository ingresoProduccionRepository;

    @Override
    public IngresoProduccion newIngresoProduccion(IngresoProduccion newIngresoProduccion) {
        return ingresoProduccionRepository.save(newIngresoProduccion);
    }

    @Override
    public Iterable<IngresoProduccion> getAll() {
        return ingresoProduccionRepository.findAll();
    }

    public IngresoProduccion modifyIngresoProduccion(IngresoProduccion ingresoProduccion) {
        Optional<IngresoProduccion> ingresoEncontrado; // Cambio aquí
        ingresoEncontrado = ingresoProduccionRepository.findById(ingresoProduccion.getidUser());
        if (ingresoEncontrado.isPresent()) {
            IngresoProduccion ingresoExistente = ingresoEncontrado.get();
            ingresoExistente.setIdUser(ingresoProduccion.getidUser()); // Cambio aquí si es necesario
            return ingresoProduccionRepository.save(ingresoExistente);
        }
        return null;
    }

    public boolean deleteIngresoProduccion(Long iduser) {
        if (ingresoProduccionRepository.existsById(iduser)) {
            ingresoProduccionRepository.deleteById(iduser);
            return true;
        }
        return false;
    }

    

  
}

