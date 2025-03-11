/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Brustock.home.services;

import com.Brustock.home.model.Login;
import com.Brustock.home.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maniz
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    public Login newLogin(Login newLogin);
    @Override
    private Login newLogin loginRepository{
        return loginRepository.save(newLogin);
    }

    @Override
    public Iterable<Login> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
