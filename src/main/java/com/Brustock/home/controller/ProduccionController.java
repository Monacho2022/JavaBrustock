
package com.Brustock.home.controller;

import com.Brustock.home.model.Produccion;
import com.Brustock.home.services.ProduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produccion")
public class ProduccionController {
     @Autowired
    private ProduccionService produccionService;
    
    @GetMapping("/mostrar")
    public Iterable<Produccion> getAll(){
        return produccionService.getAll();
    }    
    @PostMapping("/modificar")
    public Produccion updateProduccion(@RequestBody Produccion produccion){
        return this.produccionService.modifyProduccion(produccion);
    }
    @PostMapping (value="/{id}")
    public boolean deleteProduccion(@PathVariable(value="id")Long id){
        return this.produccionService.deleteProduccion(id);
    }
    
}
