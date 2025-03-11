/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Brustock.home.services;

import com.Brustock.home.model.Login;
import com.Brustock.home.repository.LoginRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maniz
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;
    
    @Override
    public Login newLogin (Login newLogin){
        return loginRepository.save(newLogin);
    }

    @Override
    public Iterable<Login> getAll() {
        return this.loginRepository.findAll();
    }
    @Override
    public Login modifyLogin(Login login) {
        Optional<Login> loginEncontrado= this.loginRepository.findById(login.getuser());
        if(loginEncontrado.get()!=null){
            loginEncontrado.get().setuser(login.getuser());
            loginEncontrado.get().setpassword(login.getpassword());
            return this.newLogin(loginEncontrado.get());
        }
        return null;
    }
    @Override
     public boolean deleteLogin(Long user) {
        this.loginRepository.deleteById(user);
      return true;  
    }

    @Override
    public Login modifyAprendiz(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteAprendiz(Long user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
