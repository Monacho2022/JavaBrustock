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
        Optional<IngresoProduccion> ingresoProduccionEncontrado = ingresoProduccionRepository.findById(ingresoProduccion.getIduser());

        if (ingresoProduccionEncontrado.isPresent()) {
            IngresoProduccion ingresoExistente = ingresoProduccionEncontrado.get();
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
    public boolean deleteIngresoProduccion(Long iduser) {
        if (ingresoProduccionRepository.existsById(iduser)) {
            ingresoProduccionRepository.deleteById(iduser);
            return true;
        }
        return false;
    }

    @Override
    public IngresoProduccion modifyAprendiz(IngresoProduccion ingresoProduccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteAprendiz(Long iduser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

