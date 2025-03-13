
package com.Brustock.home.services;

import com.Brustock.home.model.Login;

/**
 *
 * @author maniz
 */
public interface LoginService {
    Login newLogin (Login newLogin);
    Iterable<Login> getAll();
    Login modifyLogin (Login login);
    boolean deleteLogin (Long user);    
}
