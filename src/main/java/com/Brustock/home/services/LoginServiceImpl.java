package com.Brustock.home.services;

import com.Brustock.home.model.Login;
import com.Brustock.home.repository.LoginRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Login newLogin(Login newLogin) {
        return loginRepository.save(newLogin);
    }

    @Override
    public Iterable<Login> getAll() {
        return loginRepository.findAll();
    }

    @Override
    public Login modifyLogin(Login login) {
        Optional<Login> loginEncontrado = loginRepository.findById(login.getId()); 
        if (loginEncontrado.isPresent()) {
            Login loginExistente = loginEncontrado.get();
            loginExistente.setId(login.getId());
            loginExistente.setUser(login.getUser()); 
            loginExistente.setPassword(login.getPassword()); 
            return loginRepository.save(loginExistente);
        }
        return null;
    }

    @Override
    public boolean deleteLogin(Long id) {
        if (loginRepository.existsById(id)) { // Verifica si el usuario existe antes de eliminarlo
            loginRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
