package com.Brustock.home.services;


import com.Brustock.home.model.IngresoProduccion;
import com.Brustock.home.model.Produccion;
import com.Brustock.home.repository.IngresoProduccionRepository;
import com.Brustock.home.repository.ProduccionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduccionServiceImpl implements ProduccionService {

    @Autowired
    private ProduccionRepository produccionRepository;

    @Autowired
    private IngresoProduccionRepository ingresoProduccionRepository;
    
    @Override
    public List<Produccion> getAll() {
        // Implementación del método
        return null; // Debes retornar una lista de Producción válida
    }

    /**
     *
     * @param newProduccion
     * @return
     */
    @Override
    public Produccion newProduccion(Produccion newProduccion) {
        if (newProduccion.getIngresoProduccion() == null || newProduccion.getIngresoProduccion().getIdReferencia() == null) {
            throw new RuntimeException("Debe proporcionar un idReferencia válido de IngresoProduccion");
        }

        // Buscar el ingreso de producción
        IngresoProduccion ingreso = ingresoProduccionRepository.findById(newProduccion.getIngresoProduccion().getIdReferencia())
                .orElseThrow(() -> new RuntimeException("IngresoProduccion no encontrado"));

        // Asociar la producción con el ingreso de producción
        newProduccion.setIngresoProduccion(ingreso);

        return produccionRepository.save(newProduccion);
    }

    @Override
    public Produccion modifyProduccion(Produccion produccion) {
        Optional<Produccion> productoEncontrado = produccionRepository.findById(produccion.getIdReferencia());
        if (productoEncontrado.isPresent()) {
            Produccion produccionExistente = productoEncontrado.get();

            // Mantener la relación con IngresoProduccion
            produccion.setIngresoProduccion((IngresoProduccion) produccionExistente.getIngresoProduccion());

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
