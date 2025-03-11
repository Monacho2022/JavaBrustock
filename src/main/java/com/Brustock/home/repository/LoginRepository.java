
package com.Brustock.home.repository;

import com.Brustock.home.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Long> {
    
}
