package com.example.labxpert.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

public class utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String pwd;
    private String infos;
    private role role;
    public enum role {
        technicien,
        responsableLabo,
        admin;

    }
    @OneToMany
    private analyse analyse;

}
