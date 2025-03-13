package com.Brustock.home.services;

import com.Brustock.home.model.IngresoProduccion;
import com.Brustock.home.repository.IngresoProduccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngresoProduccionServiceImpl implements IngresoProduccionService {

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

    @Override
    public IngresoProduccion modifyIngresoProduccion(IngresoProduccion ingresoProduccion) {
        Optional<IngresoProduccion> ingresoEncontrado;

        // Convertimos referencia a Long para buscar en el repositorio
        ingresoEncontrado = ingresoProduccionRepository.findById(Long.parseLong(ingresoProduccion.getReferencia()));

        if (ingresoEncontrado.isPresent()) {
            IngresoProduccion ingresoExistente = ingresoEncontrado.get();
            ingresoExistente.setReferencia(ingresoProduccion.getReferencia());
            ingresoExistente.setDescripcion(ingresoProduccion.getDescripcion());
            ingresoExistente.setProceso(ingresoProduccion.getProceso());
            ingresoExistente.setTalla(ingresoProduccion.getTalla());
            ingresoExistente.setColor(ingresoProduccion.getColor());
            ingresoExistente.setFecha(ingresoProduccion.getFecha());

            return ingresoProduccionRepository.save(ingresoExistente);
        }
        return null;
    }

    @Override
    public boolean deleteIngresoProduccion(Long referencia) {
        if (ingresoProduccionRepository.existsById(referencia)) {
            ingresoProduccionRepository.deleteById(referencia);
            return true;
        }
        return false;
    }

}
