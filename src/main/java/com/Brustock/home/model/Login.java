
package com.Brustock.home.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "login")
@Data  // <-- Lombok genera automáticamente getters, setters, toString, equals, y hashCode
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String user;

    @Column(nullable = false)
    private String password;
}
