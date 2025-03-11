
package com.Brustock.home.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Login {
    @Id
    @Column    
    private Long user;
    
    @Column
    private String password;
    
}
