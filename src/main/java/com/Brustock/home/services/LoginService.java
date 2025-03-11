/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Brustock.home.services;

import com.Brustock.home.model.Login;

/**
 *
 * @author maniz
 */
public interface LoginService {
    Login newLogin (Login newLogin);
    Iterable<Login> getAll();
    Login modifyAprendiz (Login login);
    boolean deleteAprendiz (Long user);    
}
