package com.example.labxpert.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;

public class resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private analyse analyse;
    private String valeur;
    private String unites;
    private statusResultat status;
    public enum statusResultat {
        normal,
        anormal;

    }

}
