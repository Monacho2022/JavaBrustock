
package com.Brustock.home.controller;

import com.Brustock.home.model.Login;
import com.Brustock.home.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    
    @GetMapping("/mostrar")
    public Iterable<Login> getAll(){
        return loginService.getAll();
    }    
    @PostMapping("/modificar")
    public Login updateLogin(@RequestBody Login login){
        return this.loginService.modifyLogin(login);
    }
    @PostMapping (value="/{id}")
    public boolean deleteLogin(@PathVariable(value="id")Long id){
        return this.loginService.deleteLogin(id);
    }
}
