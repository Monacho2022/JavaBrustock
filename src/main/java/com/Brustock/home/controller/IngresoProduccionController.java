
package com.Brustock.home.controller;

import com.Brustock.home.model.IngresoProduccion;
import com.Brustock.home.model.Produccion;
import com.Brustock.home.services.IngresoProduccionService;
import com.Brustock.home.services.ProduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class IngresoProduccionController {
    @Autowired
    private IngresoProduccionService ingresoProduccionService;
    
    @GetMapping("/mostrar")
    public Iterable<IngresoProduccion> getAll(){
        return ingresoProduccionService.getAll();
    }    
    @PostMapping("/modificar")
    public IngresoProduccion updateIngresoProduccion(@RequestBody IngresoProduccion ingresoProduccion){
        return this.ingresoProduccionService.modifyIngresoProduccion(ingresoProduccion);
    }
    @PostMapping (value="/{id}")
    public boolean deleteProduccion(@PathVariable(value="id")Long id){
        return this.ingresoProduccionService.deleteIngresoProduccion(id);
    }
    
}
