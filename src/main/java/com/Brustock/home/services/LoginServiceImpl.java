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

    public Login modifyLogin(Login login) {
        Optional<Login> loginEncontrado = loginRepository.findById(login.getUser()); // Cambio aquí
        if (loginEncontrado.isPresent()) {
            Login loginExistente = loginEncontrado.get();
            loginExistente.setUser(login.getUser()); // Cambio aquí
            loginExistente.setPassword(login.getPassword()); // Cambio aquí
            return loginRepository.save(loginExistente);
        }
        return null;
    }

    public boolean deleteLogin(Long user) {
        if (loginRepository.existsById(user)) { // Verifica si el usuario existe antes de eliminarlo
            loginRepository.deleteById(user);
            return true;
        }
        return false;
    }
}
